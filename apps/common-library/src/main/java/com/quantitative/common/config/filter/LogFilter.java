package com.quantitative.common.config.filter;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Slf4j
@WebFilter(filterName = "LogFilter", urlPatterns = "/*")
public class LogFilter implements Filter {
    private static List<String> ignoreUriType = Arrays.asList("js", "css", "bmp", "ico", "gif", "png", "jpg");

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String rid = UUID.randomUUID().toString().replace("-", "");
        request.setAttribute("rid", rid);
        try {
            if (!ignoreUriType.contains(req.getRequestURI())) {
                MDC.put("rid", rid);
                MDC.put("requestURI", req.getRequestURI());
                MDC.put("queryString", req.getQueryString());
                MDC.put("remoteAddr", req.getRemoteAddr());
                MDC.put("httpMethod", req.getMethod());
                log.info("[Logger.Filter.Tag] rid:{},httpMethod:{},requestURI:{},queryString:{},remoteAddr:{}", rid, req.getMethod(), req.getRequestURI(), req.getQueryString(), req.getRemoteAddr());
            }
            chain.doFilter(request, response);
        } finally {
            MDC.clear();
        }
    }

}
package com.quantitative.common.config.http;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfigure {

    @Value("${restTemplate.connectTimeout}")
    private Integer connectionTimeout;
    @Value("${restTemplate.readTimeout}")
    private Integer readTimeout;

    @Bean
    RestTemplate newRestTemplate() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(connectionTimeout);// 设置超时
        requestFactory.setReadTimeout(readTimeout);
        RestTemplate template = new RestTemplate(requestFactory);
        return template;
    }
}

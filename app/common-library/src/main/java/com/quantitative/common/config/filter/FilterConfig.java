package com.quantitative.common.config.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration
public class FilterConfig {
    @Bean
    public LogFilter logFilter() {
        log.info("init logFilter...");
        return new LogFilter();

    }
}
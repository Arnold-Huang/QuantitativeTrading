package com.quantitative.binance.configure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BinanceConfigure {
    @Value("${binance.urls}")
    public String[] urls;

}

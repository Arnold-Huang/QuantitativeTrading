package com.quantitative.binance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.quantitative")
public class BinanceAPIApplication {
    public static void main(String[] args) {
        SpringApplication.run(BinanceAPIApplication.class, args);
    }
}

package com.quantitative.trading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.quantitative")
public class QuantitativeTradingApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuantitativeTradingApplication.class, args);
    }
}

package com.quantitative.binance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.quantitative")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

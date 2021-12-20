package com.quant.binance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.quant")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

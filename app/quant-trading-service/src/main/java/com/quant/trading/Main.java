package com.quant.trading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication(scanBasePackages = "com.quant")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

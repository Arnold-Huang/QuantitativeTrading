package com.quantitative.binance.configure;

import com.quantitative.binance.api.BinanceMarket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import javax.annotation.Resource;

public class ApplicationStartupRunner implements ApplicationRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationStartupRunner.class);

    @Resource
    BinanceMarket binanceMarket;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOGGER.info("server start...");
        binanceMarket.ping();
        binanceMarket.time();
    }
}

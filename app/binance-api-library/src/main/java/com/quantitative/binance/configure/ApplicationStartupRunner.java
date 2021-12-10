package com.quantitative.binance.configure;

import com.quantitative.binance.api.BinanceMarket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import javax.annotation.Resource;

@Slf4j
public class ApplicationStartupRunner implements ApplicationRunner {
    @Resource
    BinanceMarket binanceMarket;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //log.info("server start...");
        binanceMarket.ping();
        binanceMarket.time();
    }
}

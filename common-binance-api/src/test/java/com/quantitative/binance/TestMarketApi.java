package com.quantitative.binance;

import com.quantitative.binance.api.BinanceMarket;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BinanceAPIApplication.class})
public class TestMarketApi {

    @Resource
    BinanceMarket binanceMarket;

    @Test
    public void testMarket() {
        log.info("ping test respose:{}", binanceMarket.ping() == 200 ? "success" : "false");
        log.info(binanceMarket.time());
    }
}

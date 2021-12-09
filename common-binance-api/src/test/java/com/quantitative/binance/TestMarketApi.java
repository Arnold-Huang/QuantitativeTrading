package com.quantitative.binance;

import com.alibaba.fastjson.JSON;
import com.quantitative.binance.api.BinanceMarket;
import com.quantitative.binance.beans.ExchangeInfo;
import com.quantitative.binance.beans.ExchangeRateLimit;
import com.quantitative.binance.beans.ExchangeSymbol;
import com.quantitative.binance.beans.Trade;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

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

    @Test
    public void testExchangeInfo() {
        int index = 0;
        ExchangeInfo exchangeInfo = binanceMarket.exchangeInfo();
        log.info("exchangeInfo timezone:{},serverTime:{}", exchangeInfo.getTimezone(), exchangeInfo.getServerTime());
        for (ExchangeRateLimit limit : exchangeInfo.getRateLimits()) {
            log.info("{} ratalimit:{}", index, JSON.toJSONString(limit));
            index++;
        }
        index = 0;
        for (ExchangeSymbol symbol : exchangeInfo.getSymbols()) {
            log.info("{} symbol:{}", index, JSON.toJSONString(symbol));
            index++;
        }
    }

    @Test
    public void testTrades() {
        int index = 0;
        Trade[] list = binanceMarket.trades("LTCUSDT", 20);
        for (Trade trade : list) {
            log.info("{} trade:{}", index, JSON.toJSONString(trade));
            index++;
        }
    }
}

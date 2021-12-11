package com.quantitative.binance;

import com.alibaba.fastjson.JSON;
import com.quantitative.binance.api.BinanceMarket;
import com.quantitative.binance.beans.ExchangeInfo;
import com.quantitative.binance.beans.ExchangeRateLimit;
import com.quantitative.binance.beans.ExchangeSymbol;
import com.quantitative.binance.beans.Trade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMarketApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestMarketApi.class);
    @Resource
    BinanceMarket binanceMarket;

    @Test
    public void testMarket() {
        Assert.assertEquals(200, binanceMarket.ping());
        Assert.assertNull(Long.valueOf(binanceMarket.time()));
    }

    @Test
    public void testExchangeInfo() {
        int index = 0;
        ExchangeInfo exchangeInfo = binanceMarket.exchangeInfo();
        LOGGER.info("exchangeInfo timezone:{},serverTime:{}", exchangeInfo.getTimezone(), exchangeInfo.getServerTime());
        for (ExchangeRateLimit limit : exchangeInfo.getRateLimits()) {
            LOGGER.info("{} ratalimit:{}", index, JSON.toJSONString(limit));
            index++;
        }
        index = 0;
        for (ExchangeSymbol symbol : exchangeInfo.getSymbols()) {
            LOGGER.info("{} symbol:{}", index, JSON.toJSONString(symbol));
            index++;
        }
        Assert.assertNull(exchangeInfo);
    }

    @Test
    public void testTrades() {
        int index = 0;
        Trade[] list = binanceMarket.trades("LTCUSDT", 20);
        for (Trade trade : list) {
            LOGGER.info("{} trade:{}", index, JSON.toJSONString(trade));
            index++;
        }
        Assert.assertNull(list);
    }
}
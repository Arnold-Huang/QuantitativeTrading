package com.quant.test;

import com.alibaba.fastjson.JSON;
import com.quant.binance.beans.ExcangeKLine;
import com.quant.binance.enums.TradeInterval;
import com.quant.common.config.utils.DateUtils;
import com.quant.trading.Main;
import com.quant.trading.market.MarketInfor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class TestMarket {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestMarket.class);


    @Resource
    MarketInfor marketInfor;

    @Test
    public void testMarket() {
        var list = marketInfor.listAllSymbols();
        LOGGER.info("1 ALL SYMBOLS NUMBER:{}", list.size());
        list = marketInfor.listAllSymbols();
        LOGGER.info("2 ALL SYMBOLS NUMBER:{}", list.size());
        list = marketInfor.listAllSymbols();
        LOGGER.info("3 ALL SYMBOLS NUMBER:{}", list.size());
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testKline() {
        String startTime = "2021-12-20 13:00:00";
        List<ExcangeKLine> kLines = marketInfor.getKLine("BTCUSDT", TradeInterval.INTERVAL_15M, DateUtils.formatStringToDate(startTime).getTime(), 10);
        for (ExcangeKLine kLine : kLines) {
            LOGGER.info("ExcangeKLine:{}", JSON.toJSONString(kLine));
        }
        Assert.assertFalse(kLines.isEmpty());
    }
}

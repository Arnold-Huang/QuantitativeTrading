package com.quant.trading.market;

import com.quant.binance.api.BinanceMarket;
import com.quant.binance.beans.ExcangeKLine;
import com.quant.binance.beans.ExchangeInfo;
import com.quant.binance.beans.ExchangeSymbol;
import com.quant.binance.enums.TradeInterval;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class MarketInfor {
    //private static final Logger LOGGER = LoggerFactory.getLogger(MarketInfor.class);
    private static final String QUANT_ALL_SYMBOLS = "QUANT_ALL_SYMBOLS";

    @Resource
    BinanceMarket binanceMarket;

    @Cacheable(value = QUANT_ALL_SYMBOLS, key = "SYMBOLS")
    public List<String> listAllSymbols() {
        var list = new ArrayList<String>();
        ExchangeInfo exchangeInfo = binanceMarket.exchangeInfo();
        if (exchangeInfo != null) {
            for (ExchangeSymbol symbol : exchangeInfo.getSymbols()) {
                list.add(symbol.getSymbol());
            }
        }
        return list;
    }

    public List<ExcangeKLine> getKLine(String symbol, TradeInterval interval, long startTime, int limit) {
        return binanceMarket.kLine(symbol, interval, startTime, startTime + interval.getIntervalValue() * limit, limit);
    }

}

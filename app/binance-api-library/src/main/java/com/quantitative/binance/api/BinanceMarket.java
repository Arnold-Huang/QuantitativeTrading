package com.quantitative.binance.api;

import com.quantitative.binance.beans.ExchangeInfo;
import com.quantitative.binance.beans.Trade;
import com.quantitative.binance.configure.BinanceConfigure;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@Component
public class BinanceMarket {
    public static final String BINANCE_API_PING = "/api/v3/ping";
    public static final String BINANCE_API_TIME = "/api/v3/time";
    public static final String BINANCE_API_EXCHANGEINFO = "/api/v3/exchangeInfo";
    public static final String BINANCE_API_TRADES = "/api/v3/trades";
    @Resource
    BinanceConfigure binanceConfigure;
    @Resource
    RestTemplate resttemplate;

    public int ping() {
        int code = 404;
        for (String url : binanceConfigure.urls) {
            ResponseEntity<String> responseEntity = resttemplate.exchange(url + BINANCE_API_PING, HttpMethod.GET, new HttpEntity<String>(null, new HttpHeaders()), String.class);
            code = responseEntity.getStatusCodeValue();
            //log.info("ping {} status:{}", url, code);
        }
        return code;
    }

    public String time() {
        String time = null;
        for (String url : binanceConfigure.urls) {
            time = resttemplate.getForObject(url + BINANCE_API_TIME, String.class);
            if (time != null) {
                //log.info("ping {} result:{}", url, time);
                break;
            }
        }
        return time;
    }

    public ExchangeInfo exchangeInfo() {
        ExchangeInfo exchangeInfo = null;
        for (String url : binanceConfigure.urls) {
            exchangeInfo = resttemplate.getForObject(url + BINANCE_API_EXCHANGEINFO, ExchangeInfo.class);
            if (exchangeInfo != null) {
                break;
            }
        }
        return exchangeInfo;
    }

    public Trade[] trades(String symbol, int limit) {
        Trade[] tradeList = null;
        for (String url : binanceConfigure.urls) {
            tradeList = resttemplate.getForObject(url + BINANCE_API_TRADES + "?symbol=" + symbol + "&limit=" + limit, Trade[].class);
            if (tradeList != null) {
                break;
            }
        }
        return tradeList;
    }
}

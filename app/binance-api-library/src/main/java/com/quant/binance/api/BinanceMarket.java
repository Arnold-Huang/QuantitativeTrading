package com.quant.binance.api;

import com.alibaba.fastjson.JSON;
import com.quant.binance.beans.ExcangeKLine;
import com.quant.binance.beans.ExchangeInfo;
import com.quant.binance.beans.Trade;
import com.quant.binance.configure.BinanceConfigure;
import com.quant.binance.enums.TradeInterval;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class BinanceMarket {
    private static final Logger LOGGER = LoggerFactory.getLogger(BinanceMarket.class);

    public static final String BINANCE_API_PING = "/api/v3/ping";
    public static final String BINANCE_API_TIME = "/api/v3/time";
    public static final String BINANCE_API_EXCHANGEINFO = "/api/v3/exchangeInfo";
    public static final String BINANCE_API_TRADES = "/api/v3/trades";
    public static final String BINANCE_API_KLINES = "/api/v3/klines";
    @Resource
    BinanceConfigure binanceConfigure;
    @Resource
    RestTemplate resttemplate;

    /*********
     * ping测试连接状态
     * 返回200
     * */
    public int ping() {
        int code = 404;
        for (String url : binanceConfigure.urls) {
            ResponseEntity<String> responseEntity = resttemplate.exchange(url + BINANCE_API_PING, HttpMethod.GET, new HttpEntity<String>(null, new HttpHeaders()), String.class);
            code = responseEntity.getStatusCodeValue();
            LOGGER.info("ping {} status:{}", url, code);
        }
        return code;
    }

    /***********
     * 测试服务器当前交易时间
     * */
    public String time() {
        String time = null;
        long currentDate = System.currentTimeMillis();
        for (String url : binanceConfigure.urls) {
            time = resttemplate.getForObject(url + BINANCE_API_TIME, String.class);
            if (time != null) {
                long subTime = currentDate - Long.getLong(time);
                LOGGER.info("ping {} result:{},subtime with apps:{}", url, time, subTime);
                break;
            }
        }
        return time;
    }

    /***********
     * 查询币安所有交易对
     * */
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

    /*********
     * 查询某币最近交易记录
     * */
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

    /************
     * K线数据
     * */
    public List<ExcangeKLine> kLine(String symbol, TradeInterval interval, long startTime, long endTime, int limit) {
        String kLines = null;
        var excangeKLineLine = new ArrayList<ExcangeKLine>();
        for (String url : binanceConfigure.urls) {
            kLines = resttemplate.getForObject(url + BINANCE_API_KLINES + "?symbol=" + symbol + "&interval=" + interval.getInterval() + "&startTime=" + startTime + "&endTime=" + endTime + "&limit=" + limit, String.class);
            if (kLines != null) {
                for (String str : JSON.parseArray(kLines, String.class)) {
                    var kLine = new ExcangeKLine(JSON.parseArray(str, String.class));
                    //LOGGER.info("result:{}", kLines);
                    excangeKLineLine.add(kLine);
                }
                break;
            }
        }
        return excangeKLineLine;
    }
}

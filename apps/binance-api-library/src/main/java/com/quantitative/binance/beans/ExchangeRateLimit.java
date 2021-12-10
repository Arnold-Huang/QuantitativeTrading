package com.quantitative.binance.beans;

import lombok.Data;
@Data
public class ExchangeRateLimit {
    String rateLimitType;
    String interval;
    int intervalNum;
    int limit;
}

package com.quantitative.binance.beans;

import lombok.Data;

import java.util.List;

@Data
public class ExchangeInfo {
    String timezone;
    long serverTime;
    String exchangeFilters[];
    List<ExchangeSymbol> symbols;
    List<ExchangeRateLimit> rateLimits;
}

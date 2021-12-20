package com.quant.binance.beans;

import java.util.List;

public class ExchangeInfo {
    String timezone;
    long serverTime;
    String exchangeFilters[];
    List<ExchangeSymbol> symbols;
    List<ExchangeRateLimit> rateLimits;

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public long getServerTime() {
        return serverTime;
    }

    public void setServerTime(long serverTime) {
        this.serverTime = serverTime;
    }

    public String[] getExchangeFilters() {
        return exchangeFilters;
    }

    public void setExchangeFilters(String[] exchangeFilters) {
        this.exchangeFilters = exchangeFilters;
    }

    public List<ExchangeSymbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<ExchangeSymbol> symbols) {
        this.symbols = symbols;
    }

    public List<ExchangeRateLimit> getRateLimits() {
        return rateLimits;
    }

    public void setRateLimits(List<ExchangeRateLimit> rateLimits) {
        this.rateLimits = rateLimits;
    }
}

package com.quantitative.binance.beans;

import lombok.Data;

@Data
public class ExchangeSymbolFilter {
    String filterType;
    String minPrice;
    String maxPrice;
    String tickSize;
    String multiplierUp;
    String multiplierDown;
    int avgPriceMins;
    String minQty;
    String maxQty;
    String stepSize;
    String minNotional;
    boolean applyToMarket;
    int limit;
    int maxNumOrders;
    int maxNumAlgoOrders;
}

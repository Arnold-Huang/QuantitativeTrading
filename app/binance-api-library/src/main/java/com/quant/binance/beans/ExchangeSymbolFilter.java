package com.quant.binance.beans;

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

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getTickSize() {
        return tickSize;
    }

    public void setTickSize(String tickSize) {
        this.tickSize = tickSize;
    }

    public String getMultiplierUp() {
        return multiplierUp;
    }

    public void setMultiplierUp(String multiplierUp) {
        this.multiplierUp = multiplierUp;
    }

    public String getMultiplierDown() {
        return multiplierDown;
    }

    public void setMultiplierDown(String multiplierDown) {
        this.multiplierDown = multiplierDown;
    }

    public int getAvgPriceMins() {
        return avgPriceMins;
    }

    public void setAvgPriceMins(int avgPriceMins) {
        this.avgPriceMins = avgPriceMins;
    }

    public String getMinQty() {
        return minQty;
    }

    public void setMinQty(String minQty) {
        this.minQty = minQty;
    }

    public String getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(String maxQty) {
        this.maxQty = maxQty;
    }

    public String getStepSize() {
        return stepSize;
    }

    public void setStepSize(String stepSize) {
        this.stepSize = stepSize;
    }

    public String getMinNotional() {
        return minNotional;
    }

    public void setMinNotional(String minNotional) {
        this.minNotional = minNotional;
    }

    public boolean isApplyToMarket() {
        return applyToMarket;
    }

    public void setApplyToMarket(boolean applyToMarket) {
        this.applyToMarket = applyToMarket;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getMaxNumOrders() {
        return maxNumOrders;
    }

    public void setMaxNumOrders(int maxNumOrders) {
        this.maxNumOrders = maxNumOrders;
    }

    public int getMaxNumAlgoOrders() {
        return maxNumAlgoOrders;
    }

    public void setMaxNumAlgoOrders(int maxNumAlgoOrders) {
        this.maxNumAlgoOrders = maxNumAlgoOrders;
    }
}

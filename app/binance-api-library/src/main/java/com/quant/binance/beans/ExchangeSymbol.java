package com.quant.binance.beans;

import java.util.List;

public class ExchangeSymbol {
    String symbol;
    String status;
    String baseAsset;
    int baseAssetPrecision;
    String quoteAsset;
    int quotePrecision;
    int quoteAssetPrecision;
    int baseCommissionPrecision;
    int quoteCommissionPrecision;
    String[] orderTypes;
    boolean icebergAllowed;
    boolean ocoAllowed;
    boolean quoteOrderQtyMarketAllowed;
    boolean isSpotTradingAllowed;
    boolean isMarginTradingAllowed;
    List<ExchangeSymbolFilter> filters;
    String[] permissions;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBaseAsset() {
        return baseAsset;
    }

    public void setBaseAsset(String baseAsset) {
        this.baseAsset = baseAsset;
    }

    public int getBaseAssetPrecision() {
        return baseAssetPrecision;
    }

    public void setBaseAssetPrecision(int baseAssetPrecision) {
        this.baseAssetPrecision = baseAssetPrecision;
    }

    public String getQuoteAsset() {
        return quoteAsset;
    }

    public void setQuoteAsset(String quoteAsset) {
        this.quoteAsset = quoteAsset;
    }

    public int getQuotePrecision() {
        return quotePrecision;
    }

    public void setQuotePrecision(int quotePrecision) {
        this.quotePrecision = quotePrecision;
    }

    public int getQuoteAssetPrecision() {
        return quoteAssetPrecision;
    }

    public void setQuoteAssetPrecision(int quoteAssetPrecision) {
        this.quoteAssetPrecision = quoteAssetPrecision;
    }

    public int getBaseCommissionPrecision() {
        return baseCommissionPrecision;
    }

    public void setBaseCommissionPrecision(int baseCommissionPrecision) {
        this.baseCommissionPrecision = baseCommissionPrecision;
    }

    public int getQuoteCommissionPrecision() {
        return quoteCommissionPrecision;
    }

    public void setQuoteCommissionPrecision(int quoteCommissionPrecision) {
        this.quoteCommissionPrecision = quoteCommissionPrecision;
    }

    public String[] getOrderTypes() {
        return orderTypes;
    }

    public void setOrderTypes(String[] orderTypes) {
        this.orderTypes = orderTypes;
    }

    public boolean isIcebergAllowed() {
        return icebergAllowed;
    }

    public void setIcebergAllowed(boolean icebergAllowed) {
        this.icebergAllowed = icebergAllowed;
    }

    public boolean isOcoAllowed() {
        return ocoAllowed;
    }

    public void setOcoAllowed(boolean ocoAllowed) {
        this.ocoAllowed = ocoAllowed;
    }

    public boolean isQuoteOrderQtyMarketAllowed() {
        return quoteOrderQtyMarketAllowed;
    }

    public void setQuoteOrderQtyMarketAllowed(boolean quoteOrderQtyMarketAllowed) {
        this.quoteOrderQtyMarketAllowed = quoteOrderQtyMarketAllowed;
    }

    public boolean isSpotTradingAllowed() {
        return isSpotTradingAllowed;
    }

    public void setSpotTradingAllowed(boolean spotTradingAllowed) {
        isSpotTradingAllowed = spotTradingAllowed;
    }

    public boolean isMarginTradingAllowed() {
        return isMarginTradingAllowed;
    }

    public void setMarginTradingAllowed(boolean marginTradingAllowed) {
        isMarginTradingAllowed = marginTradingAllowed;
    }

    public List<ExchangeSymbolFilter> getFilters() {
        return filters;
    }

    public void setFilters(List<ExchangeSymbolFilter> filters) {
        this.filters = filters;
    }

    public String[] getPermissions() {
        return permissions;
    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }
}

package com.quantitative.binance.beans;

import lombok.Data;

import java.util.List;
@Data
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
}

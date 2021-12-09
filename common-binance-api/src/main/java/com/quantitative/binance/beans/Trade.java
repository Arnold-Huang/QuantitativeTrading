package com.quantitative.binance.beans;

import lombok.Data;

@Data
public class Trade {
    long id;
    String price;
    String qty;
    String quoteQty;
    long time;
    boolean isBuyerMaker;
    boolean isBestMatch;
}

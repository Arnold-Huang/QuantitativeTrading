package com.quant.binance.beans;

public class Trade {
    long id;
    String price;
    String qty;
    String quoteQty;
    long time;
    boolean isBuyerMaker;
    boolean isBestMatch;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getQuoteQty() {
        return quoteQty;
    }

    public void setQuoteQty(String quoteQty) {
        this.quoteQty = quoteQty;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isBuyerMaker() {
        return isBuyerMaker;
    }

    public void setBuyerMaker(boolean buyerMaker) {
        isBuyerMaker = buyerMaker;
    }

    public boolean isBestMatch() {
        return isBestMatch;
    }

    public void setBestMatch(boolean bestMatch) {
        isBestMatch = bestMatch;
    }
}

package com.quant.binance.beans;

import com.quant.common.config.utils.DateUtils;

import java.math.BigDecimal;
import java.util.List;

public class ExcangeKLine {

    /*******
     * 原始数据
     * */
    private List<String> kLines;

    /********
     * 开盘时间
     * */
    private BigDecimal openTime;
    private String openTimeStr;
    /**********
     * 开盘价
     * */
    private BigDecimal open;
    /********
     * 最高价
     * */
    private BigDecimal high;
    /**********
     * 最低价
     * */
    private BigDecimal low;
    /********
     * 收盘价(当前K线未结束的即为最新价)
     * */
    private BigDecimal close;
    /**********
     * 成交量
     * */
    private BigDecimal tradeColumn;
    /********
     * 收盘时间
     * */
    private BigDecimal closeTime;
    private String closeTimeStr;
    /**********
     * 成交额
     * */
    private BigDecimal tradeAmount;
    /*********
     * 成交笔数
     * */
    private BigDecimal tradeCount;
    /*********
     * 主动买入成交量
     * */
    private BigDecimal buyColumn;
    /**********
     * 主动买入成交额
     * */
    private BigDecimal buyAmount;

    public ExcangeKLine() {
    }

    public ExcangeKLine(List<String> kLines) {
        this.kLines = kLines;
        this.openTime = new BigDecimal(kLines.get(0));
        this.open = new BigDecimal(kLines.get(1));
        this.high = new BigDecimal(kLines.get(2));
        this.low = new BigDecimal(kLines.get(3));
        this.close = new BigDecimal(kLines.get(4));
        this.tradeColumn = new BigDecimal(kLines.get(5));
        this.closeTime = new BigDecimal(kLines.get(6));
        this.tradeAmount = new BigDecimal(kLines.get(7));
        this.tradeCount = new BigDecimal(kLines.get(8));
        this.buyColumn = new BigDecimal(kLines.get(9));
        this.buyAmount = new BigDecimal(kLines.get(10));
        this.openTimeStr = DateUtils.formatDateToTime(this.openTime.longValue());
        this.closeTimeStr = DateUtils.formatDateToTime(this.closeTime.longValue());
    }

    public List<String> getkLines() {
        return kLines;
    }

    public void setkLines(List<String> kLines) {
        this.kLines = kLines;
    }

    public BigDecimal getOpenTime() {
        return openTime;
    }

    public void setOpenTime(BigDecimal openTime) {
        this.openTime = openTime;
    }

    public String getOpenTimeStr() {
        return openTimeStr;
    }

    public void setOpenTimeStr(String openTimeStr) {
        this.openTimeStr = openTimeStr;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public BigDecimal getTradeColumn() {
        return tradeColumn;
    }

    public void setTradeColumn(BigDecimal tradeColumn) {
        this.tradeColumn = tradeColumn;
    }

    public BigDecimal getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(BigDecimal closeTime) {
        this.closeTime = closeTime;
    }

    public String getCloseTimeStr() {
        return closeTimeStr;
    }

    public void setCloseTimeStr(String closeTimeStr) {
        this.closeTimeStr = closeTimeStr;
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public BigDecimal getTradeCount() {
        return tradeCount;
    }

    public void setTradeCount(BigDecimal tradeCount) {
        this.tradeCount = tradeCount;
    }

    public BigDecimal getBuyColumn() {
        return buyColumn;
    }

    public void setBuyColumn(BigDecimal buyColumn) {
        this.buyColumn = buyColumn;
    }

    public BigDecimal getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(BigDecimal buyAmount) {
        this.buyAmount = buyAmount;
    }
}

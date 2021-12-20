package com.quant.binance.enums;

public enum TradeInterval {
    INTERVAL_1M("1m", 1000 * 60, "1 minute"),
    INTERVAL_3M("3m", 1000 * 60 * 3, "3 minute"),
    INTERVAL_5M("5m", 1000 * 60 * 5, "4 minute"),
    INTERVAL_15M("15m", 1000 * 60 * 15, "15 minute"),
    INTERVAL_30M("30m", 1000 * 60 * 30, "30 minute"),
    INTERVAL_1H("1h", 1000 * 60 * 60, "1 hour"),
    INTERVAL_2H("2h", 1000 * 60 * 60 * 2, "2 hour"),
    INTERVAL_4H("4h", 1000 * 60 * 60 * 4, "4 hour"),
    INTERVAL_6H("6h", 1000 * 60 * 60 * 6, "6 hour"),
    INTERVAL_8H("8h", 1000 * 60 * 60 * 8, "8 hour"),
    INTERVAL_12H("12h", 1000 * 60 * 60 * 12, "12 hour"),
    INTERVAL_1D("1d", 1000 * 60 * 60 * 24, "1 day"),
    INTERVAL_3D("3d", 1000 * 60 * 60 * 24 * 3, "3 day"),
    INTERVAL_1W("1w", 1000 * 60 * 60 * 24 * 7, "1 week"),
    INTERVAL_1MON("1M", 1000 * 60 * 60 * 24 * 30, "1 month");
    private final String interval;
    private final long intervalValue;
    private final String description;

    TradeInterval(String interval, long intervalValue, String description) {
        this.interval = interval;
        this.intervalValue = intervalValue;
        this.description = description;
    }

    public String getInterval() {
        return interval;
    }

    public long getIntervalValue() {
        return intervalValue;
    }

    public String getDescription() {
        return description;
    }
}

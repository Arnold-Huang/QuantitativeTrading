package com.quantitative.common.config.utils;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DateUtils {
    private static final String DATE_FORMMAT_TO_DAY = "yyyy-MM-dd";
    private static final String DATE_FORMMAT_TO_HOUR = "yyyy-MM-dd-HH";

    public static String formatDateToHour(long time) {
        SimpleDateFormat df = new SimpleDateFormat(DATE_FORMMAT_TO_HOUR);
        return df.format(time);
    }

    public static String formatDateToHour(Date time) {
        SimpleDateFormat df = new SimpleDateFormat(DATE_FORMMAT_TO_HOUR);
        return df.format(time);
    }
}

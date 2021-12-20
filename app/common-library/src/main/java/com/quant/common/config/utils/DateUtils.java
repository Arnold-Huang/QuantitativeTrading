package com.quant.common.config.utils;

import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DateUtils {
    private static final String DATE_FORMMAT_TO_TIME = "yyyy-MM-dd HH:mm:ss";

    public static String formatDateToTime(long time) {
        SimpleDateFormat df = new SimpleDateFormat(DATE_FORMMAT_TO_TIME);
        return df.format(time);
    }

    public static String formatDateToTime(Date time) {
        SimpleDateFormat df = new SimpleDateFormat(DATE_FORMMAT_TO_TIME);
        return df.format(time);
    }

    public static Date formatStringToDate(String time) {
        try {
            SimpleDateFormat df = new SimpleDateFormat(DATE_FORMMAT_TO_TIME);
            return df.parse(time);
        } catch (ParseException e) {
            return new Date();
        }
    }
}

package com.icarus.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {

    private static final String datePattern;

    static {
        datePattern = "yyyy-MM-dd HH:mm:ss";
    }

    @Override
    public Date convert(String s) {

        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        try {
            return sdf.parse(s);
        } catch (ParseException e) {
            throw new IllegalArgumentException("无效的日期格式，请使用格式：" + datePattern);
        }

    }

}

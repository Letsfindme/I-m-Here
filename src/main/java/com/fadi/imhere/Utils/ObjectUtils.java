package com.fadi.imhere.Utils;

import java.util.Date;


public class ObjectUtils<T> {

    public static Date cloneDate(Date date) {
        return date != null ? (Date) date.clone() : null;
    }
}

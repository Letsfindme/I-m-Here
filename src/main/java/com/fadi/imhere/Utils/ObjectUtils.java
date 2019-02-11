package com.fadi.imhere.Utils;

import java.util.Date;
import java.util.List;


public class ObjectUtils<T> {

    public static Date cloneDate(Date date) {
        return date != null ? (Date) date.clone() : null;
    }

    public static byte[] cloneByteArray(byte[] bytes) {
        return bytes;
    }

    public List<T> cloneList(List<T> list) {
        return list;
    }
}

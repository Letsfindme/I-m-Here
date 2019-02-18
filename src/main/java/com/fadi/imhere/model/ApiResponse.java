package com.fadi.imhere.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class ApiResponse<T> {

    private int status;
    private String message;
    private Object result;


}

package com.fadi.imhere.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ApiResponse<T> {

    private int status;
    private String message;
    private Object result;


}

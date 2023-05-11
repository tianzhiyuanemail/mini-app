package com.tictok.model;


import lombok.Data;

@Data
public class Result<T> {
    private Integer err_no;

    private String err_tips;

    private T data;
}

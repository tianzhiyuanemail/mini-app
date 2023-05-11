package com.tictok.model.token;


import lombok.Data;

@Data
public class TokenResult {
    private String access_token;

    private int expires_in;

}

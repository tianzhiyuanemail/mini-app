package com.tictok.model.token;


import lombok.Data;

@Data
public class TokenRequest {
    private String appid;

    private String secret;

    private String grant_type;
}

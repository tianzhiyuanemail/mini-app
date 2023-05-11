package com.tictok.model.jscode2session;


import lombok.Data;

@Data
public class Code2SessionRequest {
    private String appid; // 小程序ID
    private String secret; // 小程序的APP Secret，可以在开发者后台获取
    private String code; // login接口返回的登录凭证
    private String anonymous_code; // login接口返回的匿名登录凭证

}

package com.tictok.model.jscode2session;


import lombok.Data;

@Data
public class Code2SessionResult {
    private String session_key; // 会话密钥，如果请求时有 code 参数才会返回
    private String openid; // 用户在当前小程序的ID，如果请求时有 code 参数才会返回
    private String anonymous_openid; // 匿名用户在当前小程序的ID，如果请求时有 anonymous_code 参数才会返回
    private String unionid; // 用户在小程序平台的唯一标识符，请求时有 code 参数才会返回。如果开发者拥有多个小程序，可通过 unionid 来区分用户的唯一性。


}

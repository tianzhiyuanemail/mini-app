package com.tictok.enums;

import java.util.Arrays;
import java.util.Objects;

public enum ErrorCode {
    SUCCESS(0, "请求成功"),
    SYSTEM_ERROR(-1, "系统错误"),
    MISSING_PARAMETER(40014, "未传必要参数，请检查"),
    INVALID_APP_ID(40015, "appid 错误"),
    INVALID_SECRET(40017, "secret 错误"),
    INVALID_CODE(40018, "code 错误"),
    INVALID_ACODE(40019, "acode 错误"),
    OTHER(-999, "参数为空");

    private final Integer code;
    private final String message;

    ErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static String convertMsgByCode(Integer code) {
        ErrorCode errorCode1 = Arrays.stream(ErrorCode.values()).filter(errorCode -> Objects.equals(errorCode.code, code)).findFirst().orElse(OTHER);
        return errorCode1.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

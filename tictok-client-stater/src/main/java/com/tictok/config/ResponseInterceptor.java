package com.tictok.config;

import com.alibaba.fastjson.JSON;
import com.tictok.enums.ErrorCode;
import com.tictok.model.Result;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.util.Objects;

// 自定义的返回拦截器实现 Interceptor 接口
public class ResponseInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response = chain.proceed(request);

        // 在这里对响应进行处理，例如修改响应体或者进行错误处理
        ResponseBody responseBody = response.body();
//        if (responseBody != null) {
//            String originalBody = responseBody.string();
//            Result result = JSON.parseObject(originalBody, Result.class);
//            if (ErrorCode.SUCCESS.getCode() != result.getErr_no()){
//                throw new RuntimeException(ErrorCode.convertMsgByCode(result.getErr_no()));
//            }
//        }

        // 修改响应体示例：将响应体转换为字符串并添加前缀
        if (responseBody != null) {
            String originalBody = responseBody.string();
            Result result = JSON.parseObject(originalBody, Result.class);
            if (result.getErr_no() == null || !Objects.equals(ErrorCode.SUCCESS.getCode(), result.getErr_no())){
                throw new RuntimeException(ErrorCode.convertMsgByCode(result.getErr_no()));
            }
            String modifiedBody =  originalBody;
            responseBody = ResponseBody.create(responseBody.contentType(), modifiedBody);
            response = response.newBuilder().body(responseBody).build();
        }
        return response;
    }
}

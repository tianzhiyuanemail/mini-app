package com.tictok.service;

import com.tictok.api.TictokApi;
import com.tictok.model.Result;
import com.tictok.model.jscode2session.Code2SessionRequest;
import com.tictok.model.jscode2session.Code2SessionResult;
import com.tictok.model.token.TokenRequest;
import com.tictok.model.token.TokenResult;
import com.tictok.properties.TictokProperties;
import io.reactivex.Single;
import org.springframework.stereotype.Component;
import retrofit2.http.Body;

import javax.annotation.Resource;


@Component
public class TictokService {

    @Resource
    private TictokProperties tictokProperties;
    @Resource
    private TictokApi tictokApi;


   public TokenResult getAccessToken(){
       TokenRequest request = new TokenRequest();
       request.setAppid(tictokProperties.getAppKey());
       request.setSecret(tictokProperties.getAppSecret());
       request.setGrant_type("client_credential");
      return tictokApi.getAccessToken(request).blockingGet().getData();
   };

   public Code2SessionResult code2Session(Code2SessionRequest request){
       request.setAppid(tictokProperties.getAppKey());
       request.setSecret(tictokProperties.getAppSecret());
      return tictokApi.code2Session(request).blockingGet().getData();
   };


}

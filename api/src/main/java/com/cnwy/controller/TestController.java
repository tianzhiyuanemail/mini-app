package com.cnwy.controller;


import com.tictok.model.token.TokenResult;
import com.tictok.service.TictokService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
@RequestMapping("/t")
public class TestController {

    @Resource
    private TictokService tictokService;


    @RequestMapping("/aa")
    @ResponseBody
    public TokenResult aa() {
        TokenResult accessToken = tictokService.getAccessToken();
        return accessToken;
    }
}

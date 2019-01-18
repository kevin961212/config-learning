package com.kevin.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kevin
 * @version 1.0
 * @title   配置客户端Controller
 * @description
 * @createDate 2018/12/4
 */
@RestController
public class ConfigClientAuthcController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String getProfile(){
        return this.profile;
    }
}

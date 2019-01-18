package com.kevin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * @title   ConfigServer服务端
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication  //设为springboot
@EnableConfigServer     //实现服务发现，注册
public class ConfigServerEncryptRsaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEncryptRsaApplication.class, args);
        System.out.println("ConfigServerEncryptRsa启动...");
    }

}

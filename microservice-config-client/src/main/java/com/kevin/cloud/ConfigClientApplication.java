package com.kevin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @title   配置客户端ConfigClient接入配置服务端
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication  //设为springboot
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
        System.out.println("ConfigClient启动...");
    }

}

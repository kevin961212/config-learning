package com.kevin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * @title   配置客户端ConfigClient接入配置服务端
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication  //设为springboot
@EnableDiscoveryClient
public class ConfigClientEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEurekaApplication.class, args);
        System.out.println("ConfigClient启动...");
    }

}

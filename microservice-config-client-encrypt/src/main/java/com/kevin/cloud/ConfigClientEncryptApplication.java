package com.kevin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @title   配置客户端ConfigClient链接经过对称加解密的微服务配置
 *      专门为测试经过对称加解密的配置微服务
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication  //设为springboot
public class ConfigClientEncryptApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEncryptApplication.class, args);
        System.out.println("ConfigClientEncrypt启动...");
    }

}

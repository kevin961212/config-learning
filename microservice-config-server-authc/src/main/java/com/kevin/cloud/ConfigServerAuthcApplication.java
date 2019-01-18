package com.kevin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * @title   配置服务端ConfigServer设置安全认证
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication  //设为springboot
@EnableConfigServer     //实现服务发现，注册
public class ConfigServerAuthcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerAuthcApplication.class, args);
        System.out.println("ConfigServerAuthc启动...");
    }

}

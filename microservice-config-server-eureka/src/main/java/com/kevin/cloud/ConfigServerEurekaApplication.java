package com.kevin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * @title   EurekaServer结合Eureka
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication  //设为springboot
@EnableConfigServer     //实现服务发现，注册
@EnableDiscoveryClient
public class ConfigServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEurekaApplication.class, args);
        System.out.println("ConfigServerEureka启动...");
    }

}

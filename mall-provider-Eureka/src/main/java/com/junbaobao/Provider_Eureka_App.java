package com.junbaobao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//开启eureka服务类
@EnableEurekaServer
public class Provider_Eureka_App {
    public static void main(String[] args) {
        SpringApplication.run(Provider_Eureka_App.class, args);
    }
}

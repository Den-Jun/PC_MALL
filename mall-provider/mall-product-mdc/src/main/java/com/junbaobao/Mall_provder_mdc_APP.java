package com.junbaobao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Mall_provder_mdc_APP {
    public static void main(String[] args) {
        SpringApplication.run(Mall_provder_mdc_APP.class, args);
    }
}

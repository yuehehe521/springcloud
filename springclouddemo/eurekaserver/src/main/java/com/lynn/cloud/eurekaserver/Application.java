package com.lynn.cloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringCloudApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}



//@EnableEurekaServer  配置使当前工程可以作为注册与发现的服务端
//@SpringCloudApplication  标明该工程是一个spring cloud工程

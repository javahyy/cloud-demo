package com.hyy.config.register;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 *
 * @author hyy
 * @version 1.0
 * @date 2020/6/12 12:08 上午 
 */
//@SpringBootApplication(scanBasePackages = {"com.hyy"}) // 扫描通用包com.hyy 或者都统一在相同的包下
//@EnableEurekaServer // 声明这个应用是一个EurekaServer

@SpringCloudApplication
@EnableEurekaServer
public class ApplicationRegister {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRegister.class, args);
    }
}

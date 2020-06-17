package com.hyy.user;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author hyy
 * @version 1.0
 * @date 2020/6/15 8:29 下午 
 */
@SpringCloudApplication
@ComponentScan(basePackages = "com.hyy")
public class ApplicationUser {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationUser.class, args);
    }
}

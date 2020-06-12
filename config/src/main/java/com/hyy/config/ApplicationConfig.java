package com.hyy.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 陪着中心
 *
 * @author hyy
 * @version 1.0
 * @date 2020/6/12 8:06 上午 
 */
@SpringCloudApplication
@EnableConfigServer
public class ApplicationConfig {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfig.class, args);
    }
}

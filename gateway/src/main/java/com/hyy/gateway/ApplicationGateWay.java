package com.hyy.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 服务网关
 *
 * @author hyy
 * @version 1.0
 * @date 2020/6/12 8:15 上午 
 */
@SpringCloudApplication
public class ApplicationGateWay {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApplication.class, args);
    }
}

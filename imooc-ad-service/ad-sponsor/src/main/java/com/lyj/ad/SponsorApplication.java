package com.lyj.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：lyj
 * @email: : iclyj@iclyj.cn
 * @date ：2019/10/30
 */
@EnableFeignClients
@EnableCircuitBreaker //断路器
@EnableEurekaClient
@SpringBootApplication
public class SponsorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SponsorApplication.class, args);
    }

}

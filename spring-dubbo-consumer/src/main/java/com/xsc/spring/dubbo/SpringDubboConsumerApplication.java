package com.xsc.spring.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Jakexsc
 */
@SpringBootApplication
@EnableDubboConfiguration
public class SpringDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDubboConsumerApplication.class, args);
    }

}

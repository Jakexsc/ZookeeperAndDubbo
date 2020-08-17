package com.xsc.spring.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import server.ServerApi;

/**
 * @author JakeXsc
 * @version 1.0
 * @date 2020/8/17 20:39
 */
@RestController
public class HelloController {
    @Reference(version = "1.0.0")
    private ServerApi serverApi;

    @GetMapping("/sayHello/{message}")
    public String sayHello(@PathVariable("message") String message) {
        return this.serverApi.sayHello(message);
    }
}

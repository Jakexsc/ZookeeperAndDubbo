package com.xsc.spring.dubbo.provider.quick;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import server.ServerApi;

/**
 * 注意版本号
 * @author JakeXsc
 * @version 1.0
 * @date 2020/8/17 20:31
 */
@Component
@Service(version = "1.0.0", timeout = 10000, interfaceClass = ServerApi.class)
public class ServerApiImpl implements ServerApi {
    @Override
    public String sayHello(String message) {
        return "Hello :" + message;
    }
}

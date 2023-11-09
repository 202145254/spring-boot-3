package com.atwt.bootListener.boot.service;

import com.atwt.bootListener.boot.properties.RobotProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot08robotstarter.service
 * @Author: wutao
 * @CreateTime: 2023-11-04  22:32
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class HelloService {
    @Autowired
    RobotProperties robotProperties;

    public String Hello(){
        return "你好,【"+robotProperties.getName()+"】";
    }
}

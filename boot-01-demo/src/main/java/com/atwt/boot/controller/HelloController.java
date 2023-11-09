package com.atwt.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.controller
 * @Author: wutao
 * @CreateTime: 2023-06-15  01:27
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }

}

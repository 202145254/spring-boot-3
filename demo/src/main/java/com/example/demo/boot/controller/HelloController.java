package com.example.demo.boot.controller;


import com.example.demo.boot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot08robotstarter.controller
 * @Author: wutao
 * @CreateTime: 2023-11-04  23:03
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/robot/hello")
    public String hello(){
        String s = helloService.Hello();
        return s;
    }
}

package com.atwt.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.logging.controller
 * @Author: wutao
 * @CreateTime: 2023-06-17  15:40
 * @Description: TODO
 * @Version: 1.0
 */
@Slf4j
@RestController
public class HelloController {

//    Logger logger = LoggerFactory.getLogger(getClass());
    @GetMapping("/h")
    public String hello(String a,String b){

//        logger.info( "天天笑哈哈");
        log.trace("trace************");
        log.debug("debug************");
        log.info( "天天笑哈哈,a{},b{}",a,b);
        log.warn("warn***************");
        log.error("error***************");


        return "hello";

    }
}

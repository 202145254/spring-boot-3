package com.atwt.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot
 * @Author: wutao
 * @CreateTime: 2023-06-15  01:26
 * @Description: TODO
 * @Version: 1.0
 */
@SpringBootApplication //这是一个springboot应用
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}

package com.example.demo.boot;

import com.example.demo.boot.controller.HelloController;
import com.example.demo.boot.properties.RobotProperties;
import com.example.demo.boot.service.HelloService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.example.demo.boot
 * @Author: wutao
 * @CreateTime: 2023-11-06  00:40
 * @Description: TODO
 * @Version: 1.0
 */
@Import({HelloService.class, HelloController.class, RobotProperties.class})
@Configuration
public class RobotAutoConfiguration {
}

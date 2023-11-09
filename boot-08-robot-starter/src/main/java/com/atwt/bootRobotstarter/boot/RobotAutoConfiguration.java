package com.atwt.bootRobotstarter.boot;


import com.atwt.bootRobotstarter.boot.controller.HelloController;
import com.atwt.bootRobotstarter.boot.properties.RobotProperties;
import com.atwt.bootRobotstarter.boot.service.HelloService;
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

package com.atwt.bootRobotstarter.boot.annotation;

import com.atwt.bootRobotstarter.boot.RobotAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.bootRobotstarter.boot.annotation
 * @Author: wutao
 * @CreateTime: 2023-11-06  20:16
 * @Description: TODO
 * @Version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(RobotAutoConfiguration.class)
public @interface EnableRobot {

}

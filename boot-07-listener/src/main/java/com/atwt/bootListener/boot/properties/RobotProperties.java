package com.atwt.bootListener.boot.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot08robotstarter.properties.RobotProperties
 * @Author: wutao
 * @CreateTime: 2023-11-04  22:41
 * @Description: TODO
 * @Version: 1.0
 */
@ConfigurationProperties(prefix = "robot")
@Component
@Data
public class RobotProperties {
    private String name;
    private String age;
    private String email;

}

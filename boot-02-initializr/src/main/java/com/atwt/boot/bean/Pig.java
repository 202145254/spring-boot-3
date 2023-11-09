package com.atwt.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.bean
 * @Author: wutao
 * @CreateTime: 2023-06-16  18:41
 * @Description: TODO
 * @Version: 1.0
 */
//@ConfigurationProperties(prefix = "pig")
//@Component
public class Pig {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

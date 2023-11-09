package com.atwt.testEnableConfigruaionProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.testEnableConfigruaionProperties
 * @Author: wutao
 * @CreateTime: 2023-06-16  22:34
 * @Description: TODO
 * @Version: 1.0
 */
@ConfigurationProperties(prefix = "sheep")
public class Sheep {
    private Long id;
    private  String name;

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

    @Override
    public String toString() {
        return "Sheep{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

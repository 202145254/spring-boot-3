package com.atwt.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.bean
 * @Author: wutao
 * @CreateTime: 2023-06-17  11:58
 * @Description: TODO
 * @Version: 1.0
 */
@Component
@ConfigurationProperties(prefix = "person")
@Data //自动生成属性的getter/setter
public class Person {
    private String name;
    private Integer age;
    private Date birthDay;
    private Boolean like;
    private Child child;
    private List<Dog> dogs;
    private Map<String,Cat> cats;


}

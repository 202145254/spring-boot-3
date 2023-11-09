package com.atwt.boot.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.bean
 * @Author: wutao
 * @CreateTime: 2023-06-17  12:00
 * @Description: TODO
 * @Version: 1.0
 */
@Data
public class Child {
    private String name;
    private Integer age;
    private Date birthDay;
    private List<String> text;


}

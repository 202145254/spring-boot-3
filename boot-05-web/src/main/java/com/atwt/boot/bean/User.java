package com.atwt.boot.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.bean
 * @Author: wutao
 * @CreateTime: 2023-06-18  15:32
 * @Description: TODO
 * @Version: 1.0
 */
@JacksonXmlRootElement
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "user")
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private Character sex;

}

package com.atwt.bootListener.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.bootListener.bean
 * @Author: wutao
 * @CreateTime: 2023-11-03  00:49
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    private Integer uid;
    private String uname;
    private String upwd;
}

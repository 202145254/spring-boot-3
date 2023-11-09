package com.atwt.boot06ssm.bean;

import lombok.Data;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot06ssm.bean
 * @Author: wutao
 * @CreateTime: 2023-10-29  22:32
 * @Description: TODO
 * @Version: 1.0
 */
@Data
public class TUser {
    private Integer id;
    private String userName;
    private String passWord;
    private Integer age;
    private Character gender;
    private String email;

}

package com.atwt.boot06ssm.controller;

import com.atwt.boot06ssm.bean.TUser;
import com.atwt.boot06ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot06ssm.controller
 * @Author: wutao
 * @CreateTime: 2023-10-29  23:00
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/{id}")
    public TUser getUser(@PathVariable("id") Integer id){
        TUser user = userMapper.getUser(id);
        return user;
    }

}

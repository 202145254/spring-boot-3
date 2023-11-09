package com.atwt.boot.handler;

import com.atwt.boot.Boot05WebApplication;
import com.atwt.boot.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.handler
 * @Author: wutao
 * @CreateTime: 2023-10-29  20:51
 * @Description: TODO
 * @Version: 1.0
 */
@Slf4j
@Service
public class UserBizHandler {
    @Autowired
    private User user;

    public ServerResponse getUser(ServerRequest serverRequest){

        String id = serverRequest.pathVariable("id");
        user.setId(1);
        user.setName("MYXH");
        user.setAge(12);
        user.setSex('男');
        log.info("查询 {} 号用户信息成功", id);
        ServerResponse response=ServerResponse.ok().body(user);
        return response;

    }


}

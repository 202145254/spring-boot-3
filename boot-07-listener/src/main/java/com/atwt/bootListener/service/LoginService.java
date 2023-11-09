package com.atwt.bootListener.service;

import com.atwt.bootListener.bean.User;
import com.atwt.bootListener.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.bootListener.service
 * @Author: wutao
 * @CreateTime: 2023-11-03  00:52
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class LoginService {
    @Order(1)
    @EventListener
    public void onEvent(LoginSuccessEvent event){
        System.out.println(this.getClass().getName()+"感知到"+event.getClass().getName()+"事件");
        User user = (User) event.getSource();
        Login(user.getUname());

    }

    public void Login(String uname){
        System.out.println(uname+"用户成功登录");
    }
}

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
 * @CreateTime: 2023-11-03  00:56
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class WwdlbService {
    @Order(3)
    @EventListener
    public void onEvent(LoginSuccessEvent event){
        System.out.println(this.getClass().getName()+"感知到"+event.getClass().getName()+"事件");
        User user = (User) event.getSource();
        catWwdlb(user.getUname());

    }
    public void catWwdlb(String uname){
        System.out.println(uname+"正在吃旺旺大礼包");
    }
}

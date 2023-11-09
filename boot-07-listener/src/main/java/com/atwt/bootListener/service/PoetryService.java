package com.atwt.bootListener.service;

import com.atwt.bootListener.event.LoginSuccessEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.bootListener.service
 * @Author: wutao
 * @CreateTime: 2023-11-04  22:20
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class PoetryService implements ApplicationListener<LoginSuccessEvent> {
    public void VeryPoetry(){
        System.out.println("诗和远方");
    }



    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        System.out.println(this.getClass().getName()+"感知到"+event.getClass().getName()+"事件");
        VeryPoetry();
    }
}

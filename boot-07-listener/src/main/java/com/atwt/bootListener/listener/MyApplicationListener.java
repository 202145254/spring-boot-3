package com.atwt.bootListener.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.bootListener.listener
 * @Author: wutao
 * @CreateTime: 2023-11-01  22:55
 * @Description: TODO
 * @Version: 1.0
 */
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("====事件====="+event+"======到达");
    }
}

package com.atwt.bootListener.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.bootListener.event
 * @Author: wutao
 * @CreateTime: 2023-11-03  01:16
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class EventPublisher implements ApplicationEventPublisherAware {

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        applicationEventPublisher=this.applicationEventPublisher;
    }

    public void sendEvent(ApplicationEvent applicationEvent) {
        applicationEventPublisher.publishEvent(applicationEvent);

    }
}

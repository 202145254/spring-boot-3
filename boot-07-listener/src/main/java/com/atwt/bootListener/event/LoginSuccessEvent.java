package com.atwt.bootListener.event;

import com.atwt.bootListener.bean.User;
import org.springframework.context.ApplicationEvent;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.bootListener.event
 * @Author: wutao
 * @CreateTime: 2023-11-03  01:06
 * @Description: TODO
 * @Version: 1.0
 */
public class LoginSuccessEvent extends ApplicationEvent {
    public LoginSuccessEvent(User source) {
        super(source);
    }
}

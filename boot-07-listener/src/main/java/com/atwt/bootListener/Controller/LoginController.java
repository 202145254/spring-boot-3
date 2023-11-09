package com.atwt.bootListener.Controller;

import com.atwt.bootListener.bean.User;
import com.atwt.bootListener.event.EventPublisher;
import com.atwt.bootListener.event.LoginSuccessEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.bootListener.Controller
 * @Author: wutao
 * @CreateTime: 2023-11-03  00:58
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class LoginController {
    @Autowired
    EventPublisher eventpublisher;

    @GetMapping("/login")
    public String login(@RequestParam("uname") String uname, @RequestParam("upwd") String upwd) {
        User user=new User(0,uname,upwd);
        //准备事件
        LoginSuccessEvent event=new LoginSuccessEvent(user);
        //发送事件
           eventpublisher.sendEvent(event);
        return "登录成功";
    }

    @RequestMapping("/index")
    public void index(){
        System.out.println( AutoConfiguration.class.getName());
    }
}

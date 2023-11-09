package com.atwt.bootListener.service;

import com.atwt.bootListener.bean.User;
import com.atwt.bootListener.event.LoginSuccessEvent;
import org.springframework.context.ApplicationListener;
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
@Order(2)
public class CouponService implements ApplicationListener<LoginSuccessEvent> {

    public void sendCoupon(String uname){

        System.out.println(uname+"随机得到了一张优惠券");
    }

    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        System.out.println(this.getClass().getName()+"感知到"+event.getClass().getName()+"事件");
        User user = (User) event.getSource();
        sendCoupon(user.getUname());

    }
}

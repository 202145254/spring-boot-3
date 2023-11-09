package com.atwt.bootListener.listener;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.time.Duration;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.bootListener.listener
 * @Author: wutao
 * @CreateTime: 2023-11-01  19:10
 * @Description: SpringBoot应用生命周期监听
 * @Version: 1.0
 */

/*
 * 1.引导：
 * 2.启动
 * 3.运行
 */
public class MyApplicationRunListener implements SpringApplicationRunListener {

    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        System.out.println("==starting======正在启动==========");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        System.out.println("==environmentPrepared======环境准备完成==========");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("==contextPrepared======ioc容器准备完成==========");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("==contextLoaded======ioc容器加载完成==========");
    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("==started======ioc容器启动完成==========");
    }

    @Override
    public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("==ready======准备就绪==========");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("==failed======应用启动失败==========");
    }
}

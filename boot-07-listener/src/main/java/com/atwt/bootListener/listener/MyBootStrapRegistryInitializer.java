package com.atwt.bootListener.listener;

import org.springframework.boot.BootstrapRegistry;
import org.springframework.boot.BootstrapRegistryInitializer;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.bootListener.listener
 * @Author: wutao
 * @CreateTime: 2023-11-01  23:29
 * @Description: TODO
 * @Version: 1.0
 */
public class MyBootStrapRegistryInitializer implements BootstrapRegistryInitializer {
    @Override
    public void initialize(BootstrapRegistry registry) {
        System.out.println("BootRegistryInitializer感知引导初始化");
    }
}

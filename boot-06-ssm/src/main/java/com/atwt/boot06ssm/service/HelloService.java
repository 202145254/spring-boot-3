package com.atwt.boot06ssm.service;

import org.springframework.stereotype.Service;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot06ssm.service
 * @Author: wutao
 * @CreateTime: 2023-11-01  15:38
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class HelloService {
    public Integer sum(Integer a,Integer b){
        return a+b;
    }
}

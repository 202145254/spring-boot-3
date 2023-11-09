package com.atwt.boot06ssm;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot06ssm
 * @Author: wutao
 * @CreateTime: 2023-10-30  06:58
 * @Description: TODO
 * @Version: 1.0
 */
@SpringBootApplication
/*banner的用法
 *1.@MapperScan 告诉MyBatis，扫描哪个包下的所有接口
 *2.在properties里使用mybatis.mapper-locations,告诉Mybatis，每个接口的xml文件都在哪里
 *3.配置文件的优先级高于程序化调整的优先级
 */


/*
 * @description:Profile的用法
 * 1.标识环境
 * 2.配置文件开启环境 spring.profiles.active=Environment name/group name
 **/
@MapperScan(basePackages = {"com.atwt.boot06ssm.mapper"})
@Slf4j
public class Application {
    public static void main(String[] args) {


        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .main(Application.class)
                .sources(Application.class)
                .run(args);

        }




    }


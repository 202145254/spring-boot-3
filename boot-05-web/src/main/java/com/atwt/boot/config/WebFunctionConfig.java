package com.atwt.boot.config;

import com.atwt.boot.handler.UserBizHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.config
 * @Author: wutao
 * @CreateTime: 2023-10-29  20:36
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class WebFunctionConfig {

    /*
     * 函数式web
     * 1.给容器中放一个RouterFunction<ServerResponse>类型的bean，集中所有的路由信息
     * @description:
     * @param:
     * @return: 
     **/

    @Bean
    public RouterFunction<ServerResponse> userRouter(UserBizHandler userBizHandler){
        RouterFunction<ServerResponse> router= RouterFunctions.route()
                .GET("/user/{id}", RequestPredicates.accept(MediaType.ALL),userBizHandler::getUser)
                .build();

        return router;
    }

}

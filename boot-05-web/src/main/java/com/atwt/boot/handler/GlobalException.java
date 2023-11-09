package com.atwt.boot.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.handler
 * @Author: wutao
 * @CreateTime: 2023-06-24  18:43
 * @Description: TODO
 * @Version: 1.0
 */
@ControllerAdvice //集中处理所有的controller发生的错误
public class GlobalException {

//    @ExceptionHandler
//    @ResponseBody
//    public String   handlerException(Exception e){
//
//        return "Ohho~ 发生的错误是："+e;
//    }
}

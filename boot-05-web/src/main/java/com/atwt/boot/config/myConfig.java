package com.atwt.boot.config;

import com.atwt.boot.bean.User;
import com.atwt.boot.component.MyYamlHttpMessageConverter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.config
 * @Author: wutao
 * @CreateTime: 2023-06-18  13:23
 * @Description: TODO
 * @Version: 1.0
 */
//@EnableWebMvc  //禁用boot的默认规则
@EnableConfigurationProperties(User.class)
@Configuration  //这是一个配置类
public class myConfig{
//public class myConfig implements WebMvcConfigurer {

    @Bean
   public WebMvcConfigurer webMvcConfigurer() {


       return new WebMvcConfigurer() {
           @Override
           public void addResourceHandlers(ResourceHandlerRegistry registry) {
               registry.addResourceHandler("/static/**")
                       .addResourceLocations("classpath:/static/","classpath:/public/")
                       .setCacheControl(CacheControl.maxAge(1200, TimeUnit.SECONDS));
           };

           //配置一个能把对象转成yaml的messageconverter
           @Override
           public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
                    converters.add(new MyYamlHttpMessageConverter());
           }
       };
   }

//    @Bean("webMvcConfigurer")
//   public WebMvcConfigurer webMvcConfigurer2(){
//        return new WebMvcConfigurer() {
//            @Override
//            public void configurePathMatch(PathMatchConfigurer configurer) {
//                configurer.setPatternParser();
//            }
//        };
//   }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        //保留以前的默认规则,添加@EnableWebMvc后失效
//        WebMvcConfigurer.super.addResourceHandlers(registry);
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/","classpath:/public/")
//                .setCacheControl(CacheControl.maxAge(1200, TimeUnit.SECONDS));
//    }


}

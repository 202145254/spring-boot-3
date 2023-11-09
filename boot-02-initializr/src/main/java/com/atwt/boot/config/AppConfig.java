package com.atwt.boot.config;

import com.atwt.boot.bean.Cat;
import com.atwt.boot.bean.Dog;
import com.atwt.boot.bean.Pig;
import com.atwt.boot.bean.User;
import com.atwt.testEnableConfigruaionProperties.Sheep;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Scope;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.config
 * @Author: wutao
 * @CreateTime: 2023-06-16  18:02
 * @Description: TODO
 * @Version: 1.0
 */

/*@EnableConfigurationProperties的作用：
1.开启sheep组件的属性绑定
2.默认会把组件自己放到容器中
 *
 **/
@EnableConfigurationProperties(Sheep.class) //导入第三方写好的组件进行属性绑定
//SpringBoot默认只扫描自己主程序的包和其子包。如导入第三方程序的包，即使标注了@component、@ConfigurationProperties注解，也没用
@ConditionalOnMissingClass(value = "com.alibaba.druid.util.jdbc.PreparedStatementBase") //类级别，如果注解判断生效，配置文件才会生效
@SpringBootConfiguration
public class AppConfig {

    /*
     * @description:测试@Bean标签
     * @param: []
     * @return: com.atwt.boot.bean.User
     * 1.组件默认是单实例的@Scope("singleton")
     **/
//    @Scope("prototype")
//    @Bean  //代替配置文件中的bean标签，bean的默认名字为方法名，可以使用@Bean("方法名")指定
//    public User user(){
//        User user=new User();
////        user.setId(2415251532l);
////        user.setName("飞舞的小阿道夫");
//        return user;
//    }

    @ConditionalOnClass(name = "com.alibaba.druid.util.jdbc.PreparedStatementBase")
    @Bean
    public Dog dog(){
        Dog dog=new Dog();
        return dog;
    }

    @ConditionalOnMissingClass(value = "com.alibaba.druid.util.jdbc.PreparedStatementBase")
    @Bean
    public Cat cat(){
        Cat cat=new Cat();
        return cat;
    }

    @ConditionalOnBean(Dog.class)
    @Bean
    public User zhangsan(){
        User user=new User();
        return user;
    }


    @Bean
    public User lisi(){
        User user=new User();
        return user;
    }

    @ConfigurationProperties(prefix="pig")
    @Bean
    public Pig pig(){
        Pig pig =new Pig();
        return pig;
    }







}

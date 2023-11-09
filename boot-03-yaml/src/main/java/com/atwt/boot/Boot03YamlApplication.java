package com.atwt.boot;

import com.atwt.boot.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot03YamlApplication {

    public static void main(String[] args) {

        var ioc=SpringApplication.run(Boot03YamlApplication.class, args);
        Person bean = ioc.getBean(Person.class);
        System.out.println(bean);

    }

}

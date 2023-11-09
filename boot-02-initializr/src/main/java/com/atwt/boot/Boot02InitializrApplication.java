package com.atwt.boot;

import com.atwt.boot.bean.Dog;
import com.atwt.boot.bean.Pig;
import com.atwt.boot.bean.User;
import com.atwt.testEnableConfigruaionProperties.Sheep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
public class Boot02InitializrApplication {

	public static void main(String[] args) {
		var ioc=SpringApplication.run(Boot02InitializrApplication.class, args);
//		String[] beanDefinitionNames = ioc.getBeanDefinitionNames();

//		User bean1 = ioc.getBean(User.class);
//		User bean2 = ioc.getBean(User.class);
//		System.out.println(bean2==bean1);
//		Arrays.stream(beanDefinitionNames).forEach(System.out::println);
//
//		System.out.println("pig.test****************************");
//		Pig bean = ioc.getBean(Pig.class);
//		System.out.println(bean.getId());
//		System.out.println(bean.getName());
//		System.out.println("sheep.test****************************");
//		Sheep bean2 = ioc.getBean(Sheep.class);
//		System.out.println(bean2.getId());
//		System.out.println(bean2.getName());

	}

}

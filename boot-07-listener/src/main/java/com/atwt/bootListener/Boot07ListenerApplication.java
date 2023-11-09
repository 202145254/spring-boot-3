package com.atwt.bootListener;





//import com.atwt.bootRobotstarter.boot.RobotAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@MapperScan(basePackages = "com.atwt.bootListener.mapper")
//@EnableRobot
//@Import(RobotAutoConfiguration.class)
public class Boot07ListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot07ListenerApplication.class, args);
	}

}

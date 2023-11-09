package com.atwt.boot06ssm;


import com.atwt.boot06ssm.service.HelloService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot06ssm
 * @Author: wutao
 * @CreateTime: 2023-10-30  07:00
 * @Description: TODO
 * @Version: 1.0
 */
@SpringBootTest
class ApplicationTests {


    @Autowired
    HelloService helloService;

//    @DisplayName("DefaultMethod")
//    @Test
//    void contextLoads(){
//        System.out.println("DefaultMethod");
//        Integer sum = helloService.sum(2, 3);
//        Assertions.assertEquals(3,sum);
//    }

    @DisplayName("TestMethod")
    @Test
    void test(){
        System.out.println("testMethod");
    }

    /*
     * @description:测试BeforeAll注解，该注解修饰的类会在所有的测试方法运行之前运行，只运行一次
     * @param: []
     * @return: void
     **/
//    @BeforeAll
//    static void TestBeforeAll(){
//        System.out.println("BeforeAll");
//    }
//
//    /*
//     * @description:@BeforeEach注解修饰的方法会在所有的测试方法之前都运行一次
//     * @param: []
//     * @return: void
//     **/
//    @BeforeEach
//    void TestBeforeEach(){
//        System.out.println("BeforeEach");
//    }
}

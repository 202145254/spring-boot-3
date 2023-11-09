package com.atwt.boot.controller;

import com.atwt.boot.bean.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.controller
 * @Author: wutao
 * @CreateTime: 2023-06-18  14:42
 * @Description: TODO
 * @Version: 1.0
 */
@Slf4j
@RestController
public class HelloController {
    @Autowired
    User person;


    @GetMapping("/a*/b?/{p1:[a-f]}/**")
    public String test(HttpServletRequest request, @PathVariable("p1") String path) {
        log.info("路径变量p1：{}", path);
        String uri = request.getRequestURI();

        return uri;
    }

    @PostMapping("/hello")
    public User hehe() {

        int i = 10 / 0;
        return person;
    }



    @GetMapping("/person")
    public User haha() {

        int i = 10 / 0;
        return person;
    }

    @GetMapping("/index")
    public String login(Model model) {

        int [] arr=new int[]{13,3,4,3,4};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);

        }

//        int i = 10 / 0;
        return "index";
    }

    public static void main(String[] args) throws JsonProcessingException {
        User person = new User(12, "niubi", 13, '男');
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER));
        String s = mapper.writeValueAsString(person);
        System.out.println(s);
    }


}

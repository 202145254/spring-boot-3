package com.atwt.boot.controller;

import com.atwt.boot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.controller
 * @Author: wutao
 * @CreateTime: 2023-06-16  16:07
 * @Description: TODO
 * @Version: 1.0
 */
@ResponseBody
@RestController
public class HelloController {

    @Autowired
    DataSource dataSource;

    @RequestMapping("/hello")
    public String hello(){
        return "spring-initializr";
    }

    @RequestMapping("/user")
    public User druid() throws SQLException {
        Connection connection = dataSource.getConnection();
        String sql="SELECT * FROM u_book;";
        PreparedStatement ps=connection.prepareStatement(sql);
        ResultSet resultSet = ps.executeQuery();
        User user=null;
        if (resultSet.next()){
            int id=resultSet.getInt(1);
            String name=resultSet.getString(2);
            String status=resultSet.getString(3);
            user=new User(id,name,status);

        }
        return user;
    }
}

package com.example.demo6;

import com.example.demo6.entity.User1;
import com.example.demo6.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo6ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void findAll(){
        List<User1> users = userMapper.selectList(null);
        System.out.println(users);

    }


    @Test
    void contextLoads() {
    }

}

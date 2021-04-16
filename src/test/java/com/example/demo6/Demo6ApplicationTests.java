package com.example.demo6;

import com.example.demo6.bean.KnowledgeFile;
import com.example.demo6.entity.User1;
import com.example.demo6.mapper.KnowledgeFileMapper;
import com.example.demo6.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo6ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private KnowledgeFileMapper knowledgeFileMapper;



    @Test
    void findAll(){
        List<User1> users = userMapper.selectList(null);
        System.out.println(users);

    }

    @Test
    void insertUser(){
        User1 bob = new User1();
        bob.setAge(15);
        bob.setEmail("15@qq.com");
        bob.setName("Bob");
        userMapper.insert(bob);
        List<User1> users = userMapper.selectList(null);

        System.out.println(users);

    }

    @Test
    void findAll1(){
        List<User1> list = userMapper.selectList(null);
        System.out.println(list);
        //System.out.println(0);
    }



    @Test
    void insertKnowledgeFile(){
        KnowledgeFile test1 = new KnowledgeFile();
        test1.setId(1L);
        test1.setFileName("null");
        test1.setContentType(1);
        test1.setTechType(1);
        test1.setIndustryType(1);
        test1.setUrl("haha");

        knowledgeFileMapper.insert(test1);
        List<KnowledgeFile> list = knowledgeFileMapper.selectList(null);
        System.out.println(list);

        System.out.println("Complete");

    }

    @Test
    void findAllFile(){
        List<KnowledgeFile> list = knowledgeFileMapper.selectList(null);
        System.out.println(list);
        System.out.println(0);
    }


    @Test
    void contextLoads() {
    }

}

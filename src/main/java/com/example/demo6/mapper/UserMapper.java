package com.example.demo6.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo6.entity.User1;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
//@Mapper
public interface UserMapper extends BaseMapper<User1> {
        }

package com.pdh.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.pdh.entity.Result;
import com.pdh.entity.User;
import com.pdh.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: 彭_德华
 * @Date: 2021-10-26 13:16
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public Result get(Integer id){
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getId,id);
        User user = userMapper.selectOne(wrapper);
        return Result.success(user);
    }

    public Result insert(User user){
        int line = userMapper.insert(user);
        if(line > 0)
            return Result.success(line);
        return Result.fail(888,"操作数据库失败");
    }

    public Result delete(Integer id){
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getId,id);
        int line = userMapper.delete(wrapper);
        if(line > 0)
            return Result.success(line);
        return Result.fail(888,"操作数据库失败");

    }

}

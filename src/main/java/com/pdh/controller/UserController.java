package com.pdh.controller;

import com.pdh.cache.Cache;
import com.pdh.entity.Result;
import com.pdh.entity.User;
import com.pdh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Author: 彭_德华
 * @Date: 2021-10-26 11:23
 */
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get/{id}")
    @Cache(name = "get method")
    //@Cacheable(cacheNames = {"get"})
    public Result get(@PathVariable("id") Integer id){
        return userService.get(id);
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody User user){
        return userService.insert(user);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable("id") Integer id){
        return userService.delete(id);
    }

}

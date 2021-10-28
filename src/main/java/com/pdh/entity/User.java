package com.pdh.entity;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 *@Author: 彭_德华
 *@Date: 2021-10-26 11:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user_db")
public class User implements Serializable {
    @Id
    private Integer id;

    private String username;


    /**
     * String s = JSON.toJSONString(user); 存在的问题 问题就在这里
     * 因为这个问题，我就把RedisTemplate<String,Object>该为了RedisTemplate<String,String>这个数据。记录一下，非常nice
     * @param args
     */
    public static void main(String[] args) {
        String user = "name" ;
        String s = JSON.toJSONString(user);

        if(StringUtils.isNotEmpty(s)){ // 他执行的是这一个方法
            System.out.println("s非空："+s);
        }else {
            System.out.println("s为空："+s);
        }

        if(StringUtils.isNotEmpty(user)){ // 他执行的是这一个方法
            System.out.println("user非空："+user);
        }else {
            System.out.println("user为空："+user);
        }
    }
}

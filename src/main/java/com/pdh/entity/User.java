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
    
}

package com.neo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user_test")
public class UserInfo {
    private int id;
    private String name;
    private Integer age;
    private String email;
}
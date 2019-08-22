package com.example.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity //告诉JPA这是一个实体类(和数据表映射的类)
@Table(name = "user_test")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name",length = 50,nullable = false)
    private String name;
    @Column(name = "age",length = 3)
    private Integer age;
    @Column(name = "email",length = 210)
    private String email;
}
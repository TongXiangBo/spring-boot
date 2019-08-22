package com.example.controller;

import com.example.mapper.UserRepository;
import com.example.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @GetMapping("/user")
    public UserInfo getUser( Integer id){
        UserInfo one = userRepository.getOne(id);

        return one;
    }

   // @GetMapping("/user")
    public UserInfo insertUser(UserInfo user){
        UserInfo user1 = userRepository.save(user);
        return user1;
    }


}

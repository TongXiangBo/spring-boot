package com.example.controller;

import com.example.entity.UserInfo;
import com.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("testController")
public class TestController {
    @Autowired
    TestService testService;
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public void  test(String str){
      List<UserInfo> list=  testService.findAllUser();
    }
}

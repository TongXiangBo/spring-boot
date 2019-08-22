package com.neo.controller;

import com.neo.mapper.UserInfoMapper;
import com.neo.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    private UserInfoMapper userMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;
    @RequestMapping(value = "/testSelectOne", method = RequestMethod.GET)
    public void testSelectOne() {
        //User user = userMapper.selectById(1L);
        UserInfo user = userInfoMapper.selectById(1L);

        System.out.println(user);
    }

}

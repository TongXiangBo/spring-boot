package com.example.service.impl;

import com.example.entity.UserInfo;
import com.example.mapper.TestMapper;
import com.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;
    @Override
    public List<UserInfo> findAllUser() {
        List<UserInfo> list= testMapper.findAllUser();
        System.out.println(list);
        System.out.println(list);
        System.out.println(list);
        return list;
    }
}

package com.example.web;


import com.alibaba.fastjson.JSONObject;

;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.entity.User;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Mht
 * @since 2019-08-16
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userSvc;

    @GetMapping(value = "/show")
    public JSONObject testEnum() {
        Page<User> users = userSvc.selectPage(new Page<>(1, 10));
        JSONObject result = new JSONObject();
        result.put("users", users);

        return result;
    }



}

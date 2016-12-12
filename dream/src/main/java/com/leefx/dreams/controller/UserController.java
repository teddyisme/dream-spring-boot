package com.leefx.dreams.controller;

import com.alibaba.fastjson.JSONArray;
import com.leefx.dreams.model.User;
import com.leefx.dreams.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by XinSheng on 2016/12/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {

//    private static final Logger log = LogManager.getLogger(LoginController.class.getName());

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String index(ModelMap modelMap){
        List<User> userList = userService.findAllUser();
        modelMap.addAttribute("msg", JSONArray.toJSONString(userList));
        return "hello";
    }

    @RequestMapping("/register")
    public String register(ModelMap modelMap){
        userService.insertUser(new User());
        return "register";
    }

}

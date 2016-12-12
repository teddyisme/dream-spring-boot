package com.leefx.dreams.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.leefx.dreams.mapper.UserMapper;
import com.leefx.dreams.model.Success;
import com.leefx.dreams.model.User;
import com.leefx.dreams.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by XinSheng on 2016/12/9.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        List<User> userList = userMapper.findAllUser();
        System.out.println(JSONArray.toJSONString(userList));
        return userList;
    }

    @Override
    public Success insertUser(User user) {
        user.setUserName("凤飞飞");
        user.setAge(29);
        user.setPhone("13900000001");
        user.setCreatedTime(new Date(System.currentTimeMillis()));
        user.setUpdateTime(new Date(System.currentTimeMillis()));
        user.setPassword("11111");
        user.setNick("昵称啊啊");
        user.setSex(0);
        userMapper.insertUser(user);

        Success success = new Success();
        success.setCode(0);
        success.setDescription("添加成功");

        return success;
    }


}

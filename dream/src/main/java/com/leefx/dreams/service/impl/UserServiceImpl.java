package com.leefx.dreams.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.leefx.dreams.mapper.UserMapper;
import com.leefx.dreams.model.User;
import com.leefx.dreams.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by XinSheng on 2016/12/9.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public int insnert(User user) {
        return 0;
    }

    @Override
    public List<User> findAllUser() {
        List<User> userList = userMapper.findAllUser();
        System.out.println(JSONArray.toJSONString(userList));
        return userList;
    }
}

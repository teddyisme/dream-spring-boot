package com.leefx.dreams.service;

import com.leefx.dreams.model.User;

import java.util.List;

/**
 * Created by XinSheng on 2016/12/9.
 */
public interface UserService {

    User findById(Long id);

    int insnert(User user);

    List<User> findAllUser();

}
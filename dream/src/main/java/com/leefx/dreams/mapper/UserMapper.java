package com.leefx.dreams.mapper;

import com.leefx.dreams.model.Success;
import com.leefx.dreams.model.User;

import java.util.List;

public interface UserMapper {
    List<User> findAllUser();
    Success insertUser(User user);
}

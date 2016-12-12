package com.leefx.dreams.mapper;

import com.leefx.dreams.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


//@Mapper
public interface UserMapper {

//    @Select("SELECT * FROM tbl_user WHERE id = #{id}")
    User findById(@Param("id") Long id);

//    @Insert("INSERT INTO tbl_user(userName) VALUES(#{userName})")
    int insert(User user);

//    @Select("SELECT * FROM tbl_user")
    List<User> findAllUser();

}

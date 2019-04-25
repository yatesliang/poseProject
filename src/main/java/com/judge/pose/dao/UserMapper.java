package com.judge.pose.dao;

import com.judge.pose.domain.User;

import org.apache.ibatis.annotations.Insert;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
    /*@Insert({"INSERT INTO `pose`.`user` (password,name,phone,email) " +
            "value(#{password},#{name},#{phone},#{email})"})*/
    void register( User user);

    int checkUserExisted(String name);

    java.lang.String GetUserNameById(int id);

    java.lang.String GetUserSigniture(int id);
}
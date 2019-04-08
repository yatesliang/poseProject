package com.judge.pose.dao;

import com.judge.pose.domain.User;
import com.judge.pose.domain.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
}
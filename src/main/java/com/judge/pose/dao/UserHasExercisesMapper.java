package com.judge.pose.dao;

import com.judge.pose.domain.UserHasExercises;
import com.judge.pose.domain.UserHasExercisesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserHasExercisesMapper extends Mapper<UserHasExercises> {
}
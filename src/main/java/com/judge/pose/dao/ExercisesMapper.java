package com.judge.pose.dao;

import com.judge.pose.domain.Exercises;
import com.judge.pose.domain.ExercisesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ExercisesMapper extends Mapper<Exercises> {
}
package com.judge.pose.dao;

import com.judge.pose.domain.ExercisesHasImage;

import com.judge.pose.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component("exercisesHasImageMapper")
public interface ExercisesHasImageMapper extends Mapper<ExercisesHasImage> {

}
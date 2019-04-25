package com.judge.pose.dao;

import com.judge.pose.domain.Exercises;

import tk.mybatis.mapper.common.Mapper;

public interface ExercisesMapper extends Mapper<Exercises> {
    String StartExercise(String title);
}
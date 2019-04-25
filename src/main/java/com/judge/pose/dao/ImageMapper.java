package com.judge.pose.dao;

import com.judge.pose.domain.Image;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface ImageMapper extends Mapper<Image> {
    List<String> StartExercise(int id);
    List<Map<String,Object> >GetAllCourses(String type);
}
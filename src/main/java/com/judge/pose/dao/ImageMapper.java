package com.judge.pose.dao;

import com.judge.pose.domain.Image;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface ImageMapper extends Mapper<Image> {
    List<String> StartExercise(int id);
    List<Map<String,Object> >GetAllCourses(String type);
    List<Map<String,Object> >GetRecommendation(int id);
    int IsUserWithCourses(int id,Object ex_id);

    @Select("select max(id) " +
            "from image")
    Integer getMaxId();

}
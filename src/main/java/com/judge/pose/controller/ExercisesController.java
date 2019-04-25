package com.judge.pose.controller;

import com.judge.pose.dao.ImageMapper;
import com.judge.pose.dao.UserMapper;
import com.judge.pose.model.ResultModel;
import com.judge.pose.model.ResultModel2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ExercisesController {

    @Autowired
    private ImageMapper imageMapper;


    @RequestMapping(value = "/course/{type}", method = RequestMethod.GET)
    @ResponseBody
    public ResultModel2 getAllCourses(@PathVariable("type") String type){
        List<Map<String,Object> >result = imageMapper.GetAllCourses(type);
        ResultModel2 resultModel2 = new ResultModel2(result);
        return resultModel2;
    }

    @RequestMapping(value = "/course/{exercisesId}/start/image", method = RequestMethod.GET)
    @ResponseBody
    public ResultModel getCourseFirstImage(@PathVariable("exercisesId") int exercisesId){
        List<String> result =  imageMapper.StartExercise(exercisesId);
        ResultModel resultModel = new ResultModel(result);
        return resultModel;
        //return " index(totalNum) + image_url";
        //return"";
    }

    @RequestMapping(value = "/course/{exercisesId}/image/{index}", method = RequestMethod.GET)
    @ResponseBody
    public String getCourseImageByIndex(@PathVariable("exercisesId") int exercisesId,@PathVariable("index")int index){
        return " current_index + image_url";
    }
}

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


    @RequestMapping(value = "/courses/{type}/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResultModel2 getAllCourses(@PathVariable("type") String type, @PathVariable("id") int id){
        List<Map<String,Object> >result = imageMapper.GetAllCourses(type);
        for(int i = 0;i < result.size();i++){
            if(imageMapper.IsUserWithCourses(id,result.get(i).get("exercise.id"))!= 0){
                result.get(i).put("Joined",1);
            }
            else{
                result.get(i).put("Joined",0);
            }
        }
        ResultModel2 resultModel2 = new ResultModel2(result);
        return resultModel2;
    }

    @RequestMapping(value = "/course/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResultModel2 getRecommendation(@PathVariable("id") int id){
        List<Map<String,Object> >result = imageMapper.GetRecommendation(id);
        ResultModel2 resultModel2 = new ResultModel2(result);
        return resultModel2;
    }

    @RequestMapping(value = "/imgs/{exercisesId}/start/image", method = RequestMethod.GET)
    @ResponseBody
    public ResultModel getCourseFirstImage(@PathVariable("exercisesId") int exercisesId){
        List<String> result =  imageMapper.StartExercise(exercisesId);
        ResultModel resultModel = new ResultModel(result);
        return resultModel;
        //return " index(totalNum) + image_url";
        //return"";s
    }

    @RequestMapping(value = "/img/{exercisesId}/image/{index}", method = RequestMethod.GET)
    @ResponseBody
    public String getCourseImageByIndex(@PathVariable("exercisesId") int exercisesId,@PathVariable("index")int index){
        return " current_index + image_url";
    }
}

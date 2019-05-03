package com.judge.pose.controller;

import com.judge.pose.dao.UserHasExercisesMapper;
import com.judge.pose.model.ResultModel;
import com.judge.pose.model.ResultModel2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UseExercisesController {
    @Autowired
    private UserHasExercisesMapper userHasExercisesMapper;
    @RequestMapping(value = "/user/{id}/courses", method = RequestMethod.GET)
    @ResponseBody
    public ResultModel2 getUserCourses(@PathVariable("id") int id){
        List<Map<String,Object> > result = userHasExercisesMapper.GetUserCourses(id);
        ResultModel2 resultModel2 = new ResultModel2(result);
        return resultModel2;
    }

    @RequestMapping(value = "/user/{id}/courses/{exercisesId}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteUserCourses(@PathVariable("id") int id,@PathVariable("exercisesId") int exercisesId){
        if(userHasExercisesMapper.CheckDeletion(id,exercisesId)!=0){
            userHasExercisesMapper.DeleteCourse(id,exercisesId);
            return "delete success";
        }else{
            return "delete failed";
        }

    }

}

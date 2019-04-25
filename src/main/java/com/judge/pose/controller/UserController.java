package com.judge.pose.controller;


import com.judge.pose.dao.UserMapper;
import com.judge.pose.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/test")
    @ResponseBody
    public String test(HttpServletRequest request) {
        String uid = request.getParameter("uid");

        return uid;
    }

    @RequestMapping(value = "/user/{id}/name", method = RequestMethod.GET)
    @ResponseBody
    public String getUserName(@PathVariable("id") int id){
        String name = userMapper.GetUserNameById(id);
        if(name != null) {
            return name;
        }
        else{
            return "Id don't exist";
        }
    }

    @RequestMapping(value = "/user/{id}/Signiture", method = RequestMethod.GET)
    @ResponseBody
    public String getUserSigniture(@PathVariable("id") int id){
        String signiture = userMapper.GetUserSigniture(id);
        if(signiture != null) {
            return signiture;
        }
        else{
            return "Id don't exist";
        }
    }



    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    @ResponseBody
    public String register(@RequestParam("userName") String userName, @RequestParam("password") String password,
                           @RequestParam("phone") String phone, @RequestParam("email") String email) {
       if(true) {
            User user = new User();
            user.setName(userName);
            user.setPassword(password);
            user.setPhone(phone);
            user.setEmail(email);
            userMapper.register(user);
            return user.toString();
        }else{
            return "";
        }

    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        //check user
        return "ok";
    }



}

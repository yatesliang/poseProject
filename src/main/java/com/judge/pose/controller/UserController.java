package com.judge.pose.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {


    @RequestMapping("/test")
    @ResponseBody
    public String test(HttpServletRequest request) {
        String uid = request.getParameter("uid");

        return uid;
    }
}

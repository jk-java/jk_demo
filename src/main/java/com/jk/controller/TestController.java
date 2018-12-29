package com.jk.controller;

import com.jk.util.ActionReturnUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class TestController {




    @RequestMapping(value = "/insertUser" , method = {RequestMethod.POST , RequestMethod.GET } )
    @ResponseBody
    public ActionReturnUtil insertUser(){
        System.out.println("-------");
        return ActionReturnUtil.returnSuccess();
    }
}

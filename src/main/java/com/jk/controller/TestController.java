package com.jk.controller;

import com.jk.entity.User;
import com.jk.service.BaseService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @Autowired
    private BaseService baseService;

    @RequestMapping(value = "/regist" , method = {RequestMethod.POST , RequestMethod.GET } )
    public String regist(User user){
//        System.out.println("-------");
        System.out.println(user);
        if(user.getUsercode() != null && !user.getUsercode().trim().equals("")){
            System.out.println(user);
            boolean result = baseService.registUser(user);
            if(result){
                return "login";
            }
        }

        return "regist";
    }

    @GetMapping("/test")
    public void test(){
        System.out.println("---test----");

    }

    @RequestMapping(value = "/login" , method = {RequestMethod.POST , RequestMethod.GET } )
    public String login(User user){
        System.out.println("接收到登录请求");
        if(user.getUsercode() != null && !user.getUsercode().trim().equals("") && user.getPassword() != null && !user.getPassword().trim().equals("")){
            //...
            try {
                Subject subject = SecurityUtils.getSubject();
                // 登录后存放进shiro token
                UsernamePasswordToken token=new UsernamePasswordToken(user.getUsercode(),user.getPassword());
                subject.login(token);
                return "index";
            }catch (UnknownAccountException e){
                e.printStackTrace();
                return "login";
            }
            //主体,当前状态为没有认证的状态“未认证”

        }
        return "login";
    }


}

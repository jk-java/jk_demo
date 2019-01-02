package com.jk.service.impl;

import com.jk.entity.User;
import com.jk.service.BaseService;
import org.springframework.stereotype.Service;

@Service("baseService")
public class BaseServiceImpl implements BaseService{

    @Override
    public User queryInfoByUsername(String usercode) {
        return null;
    }

    @Override
    public boolean registUser(User user) {
        if(user.getUsercode() != null && user.getPassword() != null){
            if(!user.getUsercode().trim().equals("") && !user.getPassword().trim().equals("")){


            }

        }

        return false;
    }
}

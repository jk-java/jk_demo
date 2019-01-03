package com.jk.service.impl;

import com.jk.entity.User;
import com.jk.mapper.UserMapper;
import com.jk.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("baseService")
public class BaseServiceImpl implements BaseService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryInfoByUsername(String usercode) {
        return null;
    }

    @Override
    public boolean registUser(User user) {
        if(user.getUsercode() != null && user.getPassword() != null){
            if(!user.getUsercode().trim().equals("") && !user.getPassword().trim().equals("")){
                int result = userMapper.insertUser(user);
                if(result == 1){
                    return true;
                }
            }
        }
        return false;
    }

    public List<User> findAllUser(){
        return userMapper.selectAllUser();

    }
}

package com.jk.mapper;

import com.jk.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {


    public int insertUser(User user);
}

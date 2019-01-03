package com.jk.mapper;

import com.jk.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {


    public int insertUser(User user);

    public List<User> selectAllUser();
}

package com.jk.service;

import com.jk.entity.User;

import java.util.List;

public interface BaseService {

   User queryInfoByUsername(String usercode);

   boolean registUser(User user);

   List<User> findAllUser();
}

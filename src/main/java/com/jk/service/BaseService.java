package com.jk.service;

import com.jk.entity.User;

public interface BaseService {

   User queryInfoByUsername(String usercode);

   boolean registUser(User user);
}

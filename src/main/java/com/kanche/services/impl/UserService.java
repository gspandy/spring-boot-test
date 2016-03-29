package com.kanche.services.impl;

import com.kanche.mappers.UserMapper;
import com.kanche.models.User;
import com.kanche.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xialei on 16/3/29.
 */
@Service
public class UserService implements IUserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return userMapper.findByUsernameAndPassword(username, password);
    }

}

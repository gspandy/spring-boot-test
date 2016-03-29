package com.kanche.services;

import com.kanche.models.User;

/**
 * Created by xialei on 16/3/29.
 */
public interface IUserService {

    User login(String username, String password);

}

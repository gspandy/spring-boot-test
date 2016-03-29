package com.kanche.controllers;

import com.kanche.models.User;
import com.kanche.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xialei on 16/3/28.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public User login(@RequestParam(value = "username") String userName, @RequestParam(value = "password") String password) {
        return userService.login(userName, password);
    }

}

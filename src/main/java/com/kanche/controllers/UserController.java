package com.kanche.controllers;

import com.kanche.beans.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xialei on 16/3/28.
 */
@RestController
public class UserController {

    private static final String template = "Hello, $s!";

    @RequestMapping(method = RequestMethod.GET, value = "/user/login")
    public User login(@RequestParam(value="username") String userName, @RequestParam(value="password")String password) {
        return new User(userName, password);
    }

}

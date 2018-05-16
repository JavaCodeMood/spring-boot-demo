package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: codeyung  E-mail:yjc199308@gmail.com
 * @date: 2018/5/16.下午6:54
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users/{userId}")
    User getUser(@PathVariable("userId") long userId) {
        User user = userService.getUser(userId);
        return user;
    }

}

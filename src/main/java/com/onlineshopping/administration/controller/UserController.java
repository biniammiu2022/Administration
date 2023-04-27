package com.onlineshopping.administration.controller;

import com.onlineshopping.administration.entity.User;
import com.onlineshopping.administration.service.UserService;
import com.onlineshopping.administration.service.serviceimpl.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    public  UserController(UserService userService){
        this.userService=userService;
    }
    @PostMapping(value = "/register")
    public User registerUser(@RequestBody User user){
        return userService.register(user);
    }

}

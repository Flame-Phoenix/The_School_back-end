package com.flamephoenix.school.controller;

import com.flamephoenix.school.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("users")
@RestController
public class UserController {

    private final UserService userservice;


    public UserController(UserService userservice) {
        this.userservice = userservice;
    }

    @GetMapping
    public List allUsers(){

        List users = userservice.findAll();
        return users;
    }

}

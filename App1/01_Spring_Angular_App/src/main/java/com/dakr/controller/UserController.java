package com.dakr.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

    @GetMapping("/welcome")
    public String getMessage(){
        return "Welcome to Full stack Developer !!";
    }

    @GetMapping("/wish")
    public String getGreet(){
        return "Welcome to new Era !!";
    }
}

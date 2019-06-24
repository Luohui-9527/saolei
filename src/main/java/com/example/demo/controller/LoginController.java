package com.example.demo.controller;

import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping(value="/login")
    public Object getAdminAccount(String userName, String password){
        return loginService.getAdminAccount(userName,password);
    }
}

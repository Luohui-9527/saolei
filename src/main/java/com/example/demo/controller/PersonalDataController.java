package com.example.demo.controller;

import com.example.demo.service.PersonalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PersonalData")
public class PersonalDataController {
    @Autowired
    private PersonalDataService personalDataService;

    @GetMapping(value = "/getPersonalData")
    public Object getPersonalData(String phone){
        return personalDataService.getPersonalData(phone);
    }

    @PutMapping(value = "changePassword")
    public Object changePassword(String phone,String password,String updatetime){
        return  personalDataService.changePassword(phone,password,updatetime);
    }
}

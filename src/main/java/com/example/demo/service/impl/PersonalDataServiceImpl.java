package com.example.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.PersonalDataMapper;
import com.example.demo.service.PersonalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PersonalDataServiceImpl implements PersonalDataService {
    @Autowired
    private PersonalDataMapper personalDataMapper;
    @Override
    public Object getPersonalData(String phone){
        return personalDataMapper.getPersonalData(phone);
    }
    @Override
    public Object changePassword(String phone,String password,String updatetime){
        return  personalDataMapper.changePassword(phone,password,updatetime);
    }
}

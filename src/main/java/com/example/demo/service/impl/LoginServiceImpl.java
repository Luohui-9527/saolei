package com.example.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.AdminAccountMapper;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.ServerException;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AdminAccountMapper adminAccountMapper;
    @Override
    public Object getAdminAccount(String userName,String password){
        List<Map<String,Object>> list = adminAccountMapper.getAdminAccount(userName,password);
        JSONObject json = new JSONObject();
        try {
            if (list.size()>0){
                if (list.get(0).get("password").equals(password)){
                    json.put("status","success");
                    json.put("userName",list.get(0).get("username"));
                }else {
                    json.put("status","fail");
                }
            }else {
                json.put("status","fail");
            }
        }catch (Exception e){
            json.put("message",e.getMessage());
        }
        return json;
    }
}

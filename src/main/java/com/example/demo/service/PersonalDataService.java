package com.example.demo.service;

public interface PersonalDataService {
    Object getPersonalData(String phone);
    Object changePassword(String phone,String password,String updatetime);
}

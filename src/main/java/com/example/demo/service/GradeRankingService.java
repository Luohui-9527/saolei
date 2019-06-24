package com.example.demo.service;

public interface GradeRankingService {
    Object getNewPersonalDataInfo(String date,String time,String userName,String phone,String type);
    Object getNewAllDataInfo(String date,String time,String userName,String type);
    Object delPersonalData(String createtime,String  phone);
}

package com.example.demo.service.impl;

import com.example.demo.dao.GradeRankingMapper;
import com.example.demo.service.GradeRankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeRankingServiceImpl implements GradeRankingService {
    @Autowired
    private GradeRankingMapper gradeRankingMapper;

    @Override
    public Object getNewPersonalDataInfo(String date,String time,String userName,String phone,String type){
        return  gradeRankingMapper.getNewPersonalData(date,time,userName,phone,type);
    }

    @Override
    public Object getNewAllDataInfo(String date,String time,String userName,String type){
        return gradeRankingMapper.getNewAllData(date,time,userName,type);
    }

    @Override
    public Object delPersonalData(String createtime,String phone){
        return gradeRankingMapper.delPersonalData(createtime,phone);
    }
}

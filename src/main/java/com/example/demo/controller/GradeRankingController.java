package com.example.demo.controller;

import com.example.demo.service.GradeRankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/GradeRanking")
public class GradeRankingController {
    @Autowired
    private GradeRankingService gradeRankingService;

    @GetMapping(value = "/getNewPersonalDataInfo")
    public  Object getNewPersonalDataInfo(@RequestParam("date") String date,@RequestParam("time") String time,@RequestParam("userName") String userName,@RequestParam("phone") String phone,@RequestParam("value") String value){
        String type= null;
        if(value=="选项1"){
            type="1";
        }else if(value=="选项2"){
            type="2";
        }else if(value=="选项3"){
            type="3";
        }
        return gradeRankingService.getNewPersonalDataInfo(date,time,userName,phone,type);
    }

    @GetMapping(value = "/getNewAllDataInfo")
    public  Object getNewAllDataInfo(@RequestParam("date") String date,@RequestParam("time") String time,@RequestParam("userName") String userName,@RequestParam("value") String value){
        String type= null;
        if(value.equals("选项1")){
            type="1";
        }else if(value.equals("选项2")){
            type="2";
        }else if(value.equals("选项3")){
            type="3";
        }
        return gradeRankingService.getNewAllDataInfo(date,time,userName,type);
    }

    @PutMapping(value="/delPersonalData")
    public  Object delPersonalData(@RequestParam("createtime") String createtime,@RequestParam("phone") String phone){
        return gradeRankingService.delPersonalData(createtime,phone);
    }

}

package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdminAccountMapper {
    @Select("SELECT phone,password FROM user WHERE phone = #{userName}")
    List<Map<String,Object>> getAdminAccount(@Param("userName") String userName, @Param("password") String password);
}

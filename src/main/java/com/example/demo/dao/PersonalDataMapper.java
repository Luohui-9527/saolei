package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface PersonalDataMapper {
    @Select("SELECT * FROM user WHERE phone = #{phone}")
    List<Map<String,Object>> getPersonalData(@Param("phone") String phone);
    @Update("UPDATE user SET password = #{password},updatetime = #{updatetime} WHERE phone = #{phone}")
    Integer changePassword(@Param("phone") String phone,@Param("password") String password,@Param("updatetime") String updatetime);
}

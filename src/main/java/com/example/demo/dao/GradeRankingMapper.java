package com.example.demo.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface GradeRankingMapper {
    @Select("<script>" +
            "SELECT a.name,b.type,b.usetime,b.createtime FROM user a,score b WHERE a.phone=b.uid AND 1=1 " +
            "AND a.phone = #{phone}" +
            "<if test=\"type!=null\">" +
            "AND b.type LIKE CONCAT('%',#{type},'%')" +
            "</if>" +
            "<if test=\"createtime!=null\">" +
            "AND b.createtime LIKE CONCAT('%',#{createtime},'%')" +
            "</if>" +
            "<if test=\"usetime !=null\">" +
            "AND b.usetime LIKE CONCAT('%',#{usetime},'%')" +
            "</if>" +
            "<if test=\"name !=null\">" +
            "AND a.name LIKE CONCAT('%',#{name},'%')" +
            "</if>" +
            "ORDER BY b.usetime ASC" +
            "</script>")
    List<Map<String,Object>> getNewPersonalData(@Param("createtime") String createtime, @Param("usetime") String usetime, @Param("name") String name, @Param("phone") String phone, @Param("type") String type);//根据需求查询个人成绩

    @Select("<script>" +
            "SELECT a.name,b.type,b.usetime,b.createtime FROM user a,score b WHERE a.phone=b.uid AND 1=1" +
            "<if test=\"type!=null\">" +
            "AND b.type LIKE CONCAT('%',#{type},'%')" +
            "</if>" +
            "<if test=\"createtime!=null\">" +
            "AND b.createtime LIKE CONCAT('%',#{createtime},'%')" +
            "</if>" +
            "<if test=\"usetime !=null\">" +
            "AND b.usetime LIKE CONCAT('%',#{usetime},'%')" +
            "</if>" +
            "<if test=\"name !=null\">" +
            "AND a.name LIKE CONCAT('%',#{name},'%')" +
            "</if>" +
            "ORDER BY b.usetime ASC" +
            "</script>")
    List<Map<String,Object>> getNewAllData(@Param("createtime") String createtime, @Param("usetime") String usetime, @Param("name") String name, @Param("type") String type);//根据需求查询所有成绩成绩

    @Delete("DELETE FROM score WHERE createtime = #{createtime} AND uid = #{phone}")
    Integer delPersonalData(@Param("createtime") String createtime,@Param("phone") String phone);

}

package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Classtype;
import com.trkj.tsm.vo.ClasstypeVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClasstypeDao {

    int insert(Classtype record);//添加课程类别

    int updateByPrimaryKey(Classtype record);//删除课程别（修改课程类别的时效性）

    List<ClasstypeVo> selectfinds();//页面显示加分页查询

    List<ClasstypeVo> selectfindslike(String likeke);//页面显示加分页模糊查询

//    int deleteByPrimaryKey(Integer classtypeId);
//
//    int insertSelective(Classtype record);
//
//    Classtype selectByPrimaryKey(Integer classtypeId);
//
//    int updateByPrimaryKeySelective(Classtype record);


}
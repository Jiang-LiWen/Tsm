package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Arrange;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArrangeDao {
    int deleteAllArrange();//删除排课

    int insertArrange(Arrange record);//添加排课

    List<Arrange> selectAllArrange(String likelike);//查找排课信息

    int updateArrange(Arrange record);
}
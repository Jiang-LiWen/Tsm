package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Daillog;
import com.trkj.tsm.vo.DaillogVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DaillogDao {
    int deleteByPrimaryKey(Integer daillogId);

    int insert(Daillog record);

    int insertSelective(Daillog record);

    List<DaillogVo> selectByPrimaryKey();

    int updateByPrimaryKeySelective(Daillog record);

    int updateByPrimaryKey(Daillog record);

    List<DaillogVo> selectDaillog(@Param("value11")String value11,@Param("value1")String value1);
}
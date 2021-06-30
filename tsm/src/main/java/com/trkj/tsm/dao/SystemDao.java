package com.trkj.tsm.dao;

import com.trkj.tsm.entity.System;
import com.trkj.tsm.vo.ClassroomVo;
import com.trkj.tsm.vo.SystemVo;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface SystemDao {
    int deleteByPrimaryKey(Integer systemId);

    int insert(System record);

    int insertSelective(SystemVo record);

    SystemVo selectByPrimaryKey(Integer systemId);

    int updateByPrimaryKeySelective(SystemVo record);

    int updateByPrimaryKeySelective1(SystemVo record);

    int updateByPrimaryKey1(SystemVo systemVo);

    int updateByPrimaryKey2(SystemVo systemVo);

    int updateByPrimaryKey3(SystemVo systemVo);

    List<SystemVo> selectAllSystem(String flag);
}
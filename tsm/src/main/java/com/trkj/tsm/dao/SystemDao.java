package com.trkj.tsm.dao;

import com.trkj.tsm.vo.SystemVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SystemDao {
    int deleteByPrimaryKey(Integer systemId);

    int insert(System record);

    int insertSelective(SystemVo record);

    SystemVo selectByPrimaryKey(Integer systemId);

    int updateByPrimaryKeySelective(System record);

    List<SystemVo> selectAllSystem();
}
package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Unit;
import com.trkj.tsm.vo.SessionVo;
import com.trkj.tsm.vo.UnitVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UnitDao {
    int deleteByPrimaryKey(Integer unitId);

    int insert(Unit unit);

    int selectByPrimaryKey(Integer unitId);

    int updateByPrimaryKey(Unit unit);

    List<UnitVo> selectUnit();

    List<UnitVo> selectfindslike(String likeke);//页面显示加分页模糊查询
}
package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Position;
import com.trkj.tsm.entity.Session;
import com.trkj.tsm.vo.PositionVo;
import com.trkj.tsm.vo.SessionVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PositionDao {
    int deleteByPrimaryKey(Integer positionId);//删除

    int insert(Position position);//新增

    int updateByPrimaryKey(Position position);//修改

    int updatePositionTimeliness(Position position);//批量删除

    List<PositionVo> selectPosition();//分页显示

    List<PositionVo> selectPositions();

    List<PositionVo> selectPositionlike(String likeke);//页面显示加分页模糊查询
}
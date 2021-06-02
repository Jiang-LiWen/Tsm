package com.trkj.tsm.service;

import com.trkj.tsm.entity.Position;
import com.trkj.tsm.vo.PositionVo;
import com.trkj.tsm.vo.SessionVo;

import java.util.List;

public interface PositionService {
    int deleteByPrimaryKey(Integer positionId);//删除

    PositionVo insert(PositionVo positionVo);//新增

    PositionVo updateByPrimaryKey(PositionVo positionVo);//修改

    PositionVo updatePositionTimeliness(PositionVo positionVo);//批量删除

    List<PositionVo> selectPosition();//分页显示

    List<PositionVo> selectPositions();

    List<PositionVo> selectPositionlike(String likeke);//页面显示加分页模糊查询
}

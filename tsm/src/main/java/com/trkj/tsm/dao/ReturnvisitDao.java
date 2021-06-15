package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Returnvisit;
import com.trkj.tsm.vo.RegisterVo;
import com.trkj.tsm.vo.ReturnvisitVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ReturnvisitDao {
//回访显示
    List<ReturnvisitVo> selectReturnVisit(Integer registerId);
    //    增加
    int insertReturnvisit(ReturnvisitVo record);
    //    删除（修改时效性）
    int updateReturnVisitTimeLiness(ReturnvisitVo returnvisitVo);
}
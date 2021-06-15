package com.trkj.tsm.service;

import com.trkj.tsm.vo.RegisterVo;
import com.trkj.tsm.vo.ReturnvisitVo;

import java.util.List;

public interface ReturnvisitService {
//    根据生源渠道id进行查询显示
    List<ReturnvisitVo> selectReturnVisit(Integer registerId);
//    增加 回访
    ReturnvisitVo insertReturnvisit(ReturnvisitVo returnvisitVo);
    //   删除（修改时效性）
    ReturnvisitVo updateReturnVisitTimeLiness(ReturnvisitVo returnvisitVo);
}

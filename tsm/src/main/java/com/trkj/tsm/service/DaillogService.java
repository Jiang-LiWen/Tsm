package com.trkj.tsm.service;

import com.trkj.tsm.vo.DaillogVo;

import java.util.List;

public interface DaillogService {
    List<DaillogVo> selectByPrimaryKey();//查看

    int deledaillog(Integer daillogId);//删除

    DaillogVo addDaillog(DaillogVo daillogVo);//新增

    List<DaillogVo> selectDaillog(String value11,String value1);//模糊查询
}

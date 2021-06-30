package com.trkj.tsm.service;

import com.trkj.tsm.vo.DropoutVo;
import com.trkj.tsm.vo.SuspendeVo;

import java.util.List;

public interface SuspendeService {
    //    模糊查询显示
    List<SuspendeVo> selectStudentNameLike(String studentname);
    //    修改退学理由
    SuspendeVo updateSuspen(SuspendeVo suspendeVo);
    //    删除修改时效性
    SuspendeVo updateSuspendeTimeLiness(SuspendeVo suspendeVo);
    //    增加
    SuspendeVo insertSuspende(SuspendeVo suspendeVo);
    //    修改退学状态
    SuspendeVo updateSuspenStatus(SuspendeVo suspendeVo);
    //    取消退学（删除数据库表数据）
    int delRowFrom(Integer suspendeId);
}

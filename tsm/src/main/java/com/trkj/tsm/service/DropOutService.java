package com.trkj.tsm.service;

import com.trkj.tsm.vo.DropoutVo;
import com.trkj.tsm.vo.PositionVo;

import java.util.List;

public interface DropOutService {
//    模糊查询显示
    List<DropoutVo> selectStudentNameLike(String studentname);
//    修改退学理由
    DropoutVo updateDropOut(DropoutVo dropoutVo);
//    删除修改时效性
    DropoutVo updateDropOutTimeLiness(DropoutVo dropoutVo);
//    增加
    DropoutVo insertDropOut(DropoutVo dropoutVo);
//    修改退学状态
    DropoutVo updateDropOutDropoutStatus(DropoutVo dropoutVo);
//    取消退学（删除数据库表数据）
    int delRowFrom(Integer dropId);
}

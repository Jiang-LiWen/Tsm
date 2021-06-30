package com.trkj.tsm.service;

import com.trkj.tsm.entity.Earrange;

import java.util.List;

public interface EarrangeService {
    Earrange insertEarrange(Earrange record);//添加预排课内容

    List<Earrange> selectAllEarrange();//查找所有预排课内容

    List<Earrange> selectAllEarrangeGroupBys();//查找到所有预排课可选组合

    List<Earrange> selectAllEarrangeGroupByeClassRoom_Id();//查找到所有预排课的教室

    List<Earrange> selectAllEarrangeGroupByeClasses_Id();//查找到所有预排课的班级及其所对应的老师

    List<Earrange> selectAllEarrangeGroupByTeacher_Id();//查找所有预排课的老师

    Earrange deleteAllEarrange();//根据Id删除预排课内容
}

package com.trkj.tsm.service;

import com.trkj.tsm.entity.Arrange;

import java.util.List;

public interface ArrangeService {
    Arrange insertArrange(Arrange record);//添加排课

    List<Arrange> selectAllArrange(String likelike);//查找排课信息

    Arrange deleteAllArrange();//删除排课
}

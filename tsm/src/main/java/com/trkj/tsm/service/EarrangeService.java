package com.trkj.tsm.service;

import com.trkj.tsm.entity.Earrange;

import java.util.List;

public interface EarrangeService {
    Earrange insertEarrange(Earrange record);//添加预排课内容

    List<Earrange> selectAllEarrange();//查找所有预排课内容

    Earrange deleteEarrangeById(Integer earrangeId);//根据Id删除预排课内容
}

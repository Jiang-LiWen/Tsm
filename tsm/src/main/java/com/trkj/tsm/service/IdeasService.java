package com.trkj.tsm.service;

import com.trkj.tsm.vo.IdeasVo;

import java.util.List;

public interface IdeasService {
    List<IdeasVo> selectByPrimaryKey();//查看所有收到的意见
    IdeasVo insert(IdeasVo ideasVo);//新增
    List<IdeasVo> selectState(String value1);//查询收件表状态为未回复的
    List<IdeasVo> selectIdeas(String value2);//查询发件表状态
    List<IdeasVo> selectByPrimaryKey2();//查看所有发出意见
    IdeasVo updateIdeas(IdeasVo ideasVo);//回复意见

}

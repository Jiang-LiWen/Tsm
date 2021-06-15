package com.trkj.tsm.service;

import com.trkj.tsm.vo.IdeasVo;

import java.util.List;

public interface IdeasService {
    List<IdeasVo> selectByPrimaryKey();//查看
    IdeasVo insert(IdeasVo ideasVo);//新增

}

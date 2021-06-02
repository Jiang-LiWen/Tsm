package com.trkj.tsm.service;

import com.trkj.tsm.entity.Session;
import com.trkj.tsm.vo.SessionVo;

import java.util.List;

public interface SessionService {
    int deleteByPrimaryKey(Integer sessionId);

    SessionVo insert(SessionVo sessionVo);

    int selectByPrimaryKey(Integer sessionId);

    SessionVo updateByPrimaryKey(SessionVo sessionVo);

    SessionVo updateTimeliness(SessionVo sessionVo);

    List<SessionVo> selectSession();

    List<SessionVo> selectfindslike(String likeke);
}

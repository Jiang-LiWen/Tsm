package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.SessionDao;
import com.trkj.tsm.entity.Session;
import com.trkj.tsm.service.SessionService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.SessionVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SessionServiceImpl implements SessionService {
    @Autowired
    private SessionDao sessionDao;
    @Override
    public int deleteByPrimaryKey(Integer sessionId) {
        return sessionDao.deleteByPrimaryKey(sessionId);
    }

    @Override
    public SessionVo insert(SessionVo sessionVo) {
        Session s = new Session();
        BeanCopyUtil.copyProperties(sessionVo,s);
        sessionDao.insert(s);
        return sessionVo;
    }

    @Override
    public int selectByPrimaryKey(Integer sessionId) {

        return sessionDao.selectByPrimaryKey(sessionId);
    }

    @Override
    public SessionVo updateByPrimaryKey(SessionVo sessionVo) {
        Session s = new Session();
        BeanCopyUtil.copyProperties(sessionVo,s);
        sessionDao.updateByPrimaryKey(s);
        return sessionVo;
    }

    @Override
    public SessionVo updateTimeliness(SessionVo sessionVo) {
        Session s = new Session();
        BeanCopyUtil.copyProperties(sessionVo,s);
        sessionDao.updateTimeliness(s);
        return sessionVo;
    }

    @Override
    public List<SessionVo> selectSession() {

        return sessionDao.selectSession();
    }

    @Override
    public List<SessionVo> selectfindslike(String likeke) {
        return sessionDao.selectfindslike(likeke);
    }
}

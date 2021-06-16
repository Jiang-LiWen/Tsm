package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.IdeasDao;
import com.trkj.tsm.service.IdeasService;
import com.trkj.tsm.vo.IdeasVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class IdeasServiceImpl implements IdeasService {
    @Autowired
    private IdeasDao ideasDao;

    @Override
    public List<IdeasVo> selectByPrimaryKey() {

        return ideasDao.selectByPrimaryKey();
    }

    @Override
    public IdeasVo insert(IdeasVo ideasVo) {
        log.debug("增加意见表信息");
        ideasDao.insert(ideasVo);
        return ideasVo;
    }

    @Override
    public List<IdeasVo> selectState(String value1) {
        return ideasDao.selectState(value1);
    }
}

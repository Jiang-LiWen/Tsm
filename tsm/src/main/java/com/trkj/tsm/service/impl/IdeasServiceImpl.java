package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.IdeasDao;
import com.trkj.tsm.service.IdeasService;
import com.trkj.tsm.util.BeanCopyUtil;
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
        ideasVo.setType(1);
        ideasDao.insert(ideasVo);
        return ideasVo;
    }

    @Override
    public List<IdeasVo> selectState(String value1) {
        return ideasDao.selectState(value1);
    }

    @Override
    public List<IdeasVo> selectIdeas(String value2) {
        return ideasDao.selectIdeas(value2);
    }

    @Override
    public List<IdeasVo> selectByPrimaryKey2() {
        return ideasDao.selectByPrimaryKey2();
    }

    @Override
    public IdeasVo updateIdeas(IdeasVo ideasVo) {
        log.debug("修改信息");
        IdeasVo i=new IdeasVo();
        BeanCopyUtil.copyProperties(ideasVo,i);
        ideasDao.updateIdeas(i);
        return ideasVo;
    }
}

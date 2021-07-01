package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.ArrangeDao;
import com.trkj.tsm.entity.Arrange;
import com.trkj.tsm.service.ArrangeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class ArrangeServiceImpl implements ArrangeService {
    @Resource
    private ArrangeDao arrangeDao;

    @Override
    public Arrange insertArrange(Arrange record) {
        log.debug("ArrangeService:添加预排课-------------------------------------");
        int ArrangeId=arrangeDao.insertArrange(record);
        return record;
    }

    @Override
    public List<Arrange> selectAllArrange(String likelike) {
        log.debug("ArrangeService:添加预排课-------------------------------------");
        return arrangeDao.selectAllArrange(likelike);
    }

    @Override
    public Arrange deleteAllArrange() {
        Arrange arrange=new Arrange();
        int arrangeId=arrangeDao.deleteAllArrange();
        return arrange;
    }

    @Override
    public Arrange updateArrange(Arrange record) {
        log.debug("ArrangeService:修改课表-------------------------------------");
        int ArrangeId=arrangeDao.updateArrange(record);
        return record;
    }
}

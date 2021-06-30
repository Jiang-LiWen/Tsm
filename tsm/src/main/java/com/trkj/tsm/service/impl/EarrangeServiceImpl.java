package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.EarrangeDao;
import com.trkj.tsm.entity.Earrange;
import com.trkj.tsm.service.EarrangeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class EarrangeServiceImpl implements EarrangeService {
    @Resource
    private EarrangeDao earrangeDao;

    @Override
    public Earrange insertEarrange(Earrange record) {
        log.debug("EarrangeService:添加预排课-------------------------------------");
        int EarrangeId=earrangeDao.insertEarrange(record);
        return record;
    }

    @Override
    public List<Earrange> selectAllEarrange() {
        log.debug("EarrangeService:查找所有预排课-------------------------------------");
        return earrangeDao.selectAllEarrange();
    }

    @Override
    public List<Earrange> selectAllEarrangeGroupBys() {
        log.debug("EarrangeService:查找到所有预排课可选组合-------------------------------------");
        return earrangeDao.selectAllEarrangeGroupBys();
    }

    @Override
    public List<Earrange> selectAllEarrangeGroupByeClassRoom_Id() {
        log.debug("EarrangeService:查找到所有预排课的教室-------------------------------------");
        return earrangeDao.selectAllEarrangeGroupByeClassRoom_Id();
    }

    @Override
    public List<Earrange> selectAllEarrangeGroupByeClasses_Id() {
        log.debug("EarrangeService:查找到所有预排课的班级及其所对应的老师-------------------------------------");
        return earrangeDao.selectAllEarrangeGroupByeClasses_Id();
    }

    @Override
    public List<Earrange> selectAllEarrangeGroupByTeacher_Id() {
        log.debug("EarrangeService:查找所有预排课的老师-------------------------------------");
        return earrangeDao.selectAllEarrangeGroupByTeacher_Id();
    }

    @Override
    public Earrange deleteAllEarrange() {
        log.debug("EarrangeService:删除预排课-------------------------------------");
        Earrange earrange=new Earrange();
        int EarrangeId=earrangeDao.deleteAllEarrange();
        return earrange;
    }
}

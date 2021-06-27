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
    public Earrange deleteEarrangeById(Integer earrangeId) {
        log.debug("EarrangeService:根据Id删除预排课-------------------------------------");
        Earrange earrange=new Earrange();
        int EarrangeId=earrangeDao.deleteEarrangeById(earrangeId);
        return earrange;
    }
}

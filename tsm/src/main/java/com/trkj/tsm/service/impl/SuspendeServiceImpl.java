package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.SuspendeDao;
import com.trkj.tsm.service.SuspendeService;
import com.trkj.tsm.vo.DropoutVo;
import com.trkj.tsm.vo.SuspendeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class SuspendeServiceImpl implements SuspendeService {
    @Resource
    private SuspendeDao suspendeDao;

    @Override
    public List<SuspendeVo> selectStudentNameLike(String studentname) {
        log.debug("模糊查询学生姓名---------------------ImpI");
        return suspendeDao.selectStudentNameLike(studentname);
    }

    @Override
    public SuspendeVo updateSuspen(SuspendeVo suspendeVo) {
        log.debug("修改退学理由------------------ImpI");
        suspendeDao.updateSuspen(suspendeVo);
        return suspendeVo;
    }

    @Override
    public SuspendeVo updateSuspendeTimeLiness(SuspendeVo suspendeVo) {
        log.debug("删除（修改时效性）===================ImpI");
        suspendeDao.updateSuspendeTimeLiness(suspendeVo);
        return suspendeVo;
    }

    @Override
    public SuspendeVo insertSuspende(SuspendeVo suspendeVo) {
        log.debug("增加退学信息---------------------ImpI");
        suspendeVo.setCourseId(suspendeVo.getCourse().getCourseId());
        suspendeDao.insertSuspende(suspendeVo);
        return suspendeVo;
    }

    @Override
    public SuspendeVo updateSuspenStatus(SuspendeVo suspendeVo) {
        log.debug("修改退学状态-------------------ImpI");
        suspendeDao.updateSuspenStatus(suspendeVo);
        return suspendeVo;
    }


    @Override
    public int delRowFrom(Integer suspendeId) {
        return suspendeDao.delRowFrom(suspendeId);
    }
}

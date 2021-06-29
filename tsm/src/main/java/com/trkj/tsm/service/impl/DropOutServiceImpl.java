package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.DropoutDao;
import com.trkj.tsm.service.DropOutService;
import com.trkj.tsm.vo.DropoutVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class DropOutServiceImpl implements DropOutService {
    @Autowired
    private DropoutDao dropoutDao;
    @Override
    public List<DropoutVo> selectStudentNameLike(String studentname) {
        log.debug("模糊查询学生姓名---------------------ImpI");
        return dropoutDao.selectStudentNameLike(studentname);
    }

    @Override
    public DropoutVo updateDropOut(DropoutVo dropoutVo) {
        log.debug("修改退学理由------------------ImpI");
        dropoutDao.updateDropOut(dropoutVo);
        return dropoutVo;
    }

    @Override
    public DropoutVo updateDropOutTimeLiness(DropoutVo dropoutVo) {
        log.debug("删除（修改时效性）===================ImpI");
        dropoutDao.updateDropOutTimeLiness(dropoutVo);
        return dropoutVo;
    }

    @Override
    public DropoutVo insertDropOut(DropoutVo dropoutVo) {
        log.debug("增加退学信息---------------------ImpI");
        dropoutVo.setStudentId(dropoutVo.getStudent().getStudentId());
        dropoutVo.setCourseId(dropoutVo.getCourse().getCourseId());
        dropoutVo.setDetailcourseId(dropoutVo.getDetailcourse().getDetailcourseId());
        dropoutVo.setClassesId(dropoutVo.getClasses().getClassesId());
        dropoutDao.insertDropOut(dropoutVo);
        return dropoutVo;
    }

    @Override
    public DropoutVo updateDropOutDropoutStatus(DropoutVo dropoutVo) {
        log.debug("修改退学状态-------------------ImpI");
        dropoutDao.updateDropOutDropoutStatus(dropoutVo);
        return dropoutVo;
    }

    @Override
    public int delRowFrom(Integer dropId) {
        return dropoutDao.delRowFrom(dropId);
    }
}

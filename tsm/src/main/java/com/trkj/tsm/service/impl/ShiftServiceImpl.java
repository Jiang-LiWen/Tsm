package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.ShiftDao;
import com.trkj.tsm.service.ShiftService;
import com.trkj.tsm.vo.ShiftVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
@Slf4j
public class ShiftServiceImpl implements ShiftService {
    @Autowired
    private ShiftDao shiftDao;
    @Override
    public List<ShiftVo> selectStudentNameLike(String studentname) {
        log.debug("模糊查询学生姓名---------------------ImpI");
        return shiftDao.selectStudentNameLike(studentname);
    }

//    @Override
//    public List<ShiftVo> selectClassesOpen(String classesOpen) {
//        log.debug("模糊查询开班状态---------------------ImpI");
//        log.debug(classesOpen+"==================ImpI");
//        return shiftDao.selectClassesOpen(classesOpen);
//    }

    @Override
    public ShiftVo updateShiftTimeLiness(ShiftVo shiftVo) {
        log.debug("删除（修改时效性）===================ImpI");
        shiftVo.setDeletetime(new Date());
        shiftDao.updateShiftTimeLiness(shiftVo);
        return shiftVo;
    }

    @Override
    public ShiftVo updateShiftApproval(ShiftVo shiftVo) {
        log.debug("审批===================ImpI");
        shiftVo.setJwApptime(new Date());
        shiftVo.setJwAppname("dsb");
        shiftDao.updateShiftApproval(shiftVo);
        return shiftVo;
    }

    @Override
    public ShiftVo insertShift(ShiftVo shiftVo) {
        log.debug("增加===================ImpI");
        shiftDao.insertShift(shiftVo);
        return shiftVo;
    }

    @Override
    public ShiftVo updataShift(ShiftVo shiftVo) {
        log.debug("修改转班理由===================ImpI");
        shiftDao.updataShift(shiftVo);
        return shiftVo;
    }
}

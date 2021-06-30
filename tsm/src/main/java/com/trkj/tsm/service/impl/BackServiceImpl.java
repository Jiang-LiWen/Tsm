package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.BackDao;
import com.trkj.tsm.service.BackService;
import com.trkj.tsm.vo.BackVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
@Slf4j
public class BackServiceImpl implements BackService {
    @Autowired
    private BackDao backDao;
    @Override
    public List<BackVo> selectLikeStudentName(String studentname) {
        log.debug("模糊查询学生姓名---------------------ImpI");
        return backDao.selectLikeStudentName(studentname);
    }

    @Override
    public BackVo updateBackTimeLiness(BackVo backVo) {
        log.debug("删除（修改时效性）===================ImpI");
        backDao.updateBackTimeLiness(backVo);
        return backVo;
    }

    @Override
    public BackVo updateBack(BackVo backVo) {
        log.debug("修改===================ImpI");
        backVo.setUpdatetime(new Date());
        backVo.setUpdatename("dsb");
        backDao.updateBack(backVo);
        return backVo;
    }

    @Override
    public BackVo updateBackApproval(BackVo backVo) {
        log.debug("审批===================ImpI");
        backDao.updateBackApproval(backVo);
        return backVo;
    }

    @Override
    public int delRowFrom(Integer backId) {
        log.debug("删除数据库成功===================ImpI");
        return backDao.delRowFrom(backId);
    }

    @Override
    public BackVo insertBack(BackVo backVo) {
        log.debug(backVo.toString()+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        backDao.insertBack(backVo);
        return backVo;
    }
}

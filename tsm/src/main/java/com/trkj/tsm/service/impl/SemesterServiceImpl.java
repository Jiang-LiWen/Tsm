package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.SemesterDao;
import com.trkj.tsm.entity.Semester;
import com.trkj.tsm.service.SemesterService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.SemesterVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SemesterServiceImpl implements SemesterService {
    @Autowired
    private SemesterDao semesterDao;
    @Override
    public int deleteByPrimaryKey(Integer semesterId) {

        return semesterDao.deleteByPrimaryKey(semesterId);
    }

    @Override
    public SemesterVo insert(SemesterVo semestervo) {
        Semester d = new Semester();
        BeanCopyUtil.copyProperties(semestervo,d);
        semesterDao.insert(d);
        return semestervo;
    }

    @Override
    public int selectByPrimaryKey(Integer semesterId) {

        return semesterDao.selectByPrimaryKey(semesterId);
    }

    @Override
    public SemesterVo updateByPrimaryKey(SemesterVo semesterVo) {
        Semester d = new Semester();
        BeanCopyUtil.copyProperties(semesterVo,d);
        semesterDao.updateByPrimaryKey(d);
        return semesterVo;
    }

    @Override
    public List<SemesterVo> selectSemester() {

        return semesterDao.selectSemester();
    }
}

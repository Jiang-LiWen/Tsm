package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.DeptDao;
import com.trkj.tsm.entity.Dept;
import com.trkj.tsm.service.DeptService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.DeptVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public int deleteByPrimaryKey(Integer deptId) {
        return deptDao.deleteByPrimaryKey(deptId);
    }

    @Override
    public DeptVo updateDeptTimeliness(DeptVo deptVo) {
        Dept d = new Dept();
        BeanCopyUtil.copyProperties(deptVo,d);
        deptDao.updateDeptTimeliness(d);
        return deptVo;
    }

    @Override
    public DeptVo insert(DeptVo deptVo) {
        Dept d = new Dept();
        BeanCopyUtil.copyProperties(deptVo,d);
        deptDao.insert(d);
        return deptVo;
    }

    @Override
    public DeptVo updateByPrimaryKey(DeptVo deptVo) {
        Dept d = new Dept();
        BeanCopyUtil.copyProperties(deptVo,d);
        deptDao.updateByPrimaryKey(d);
        return deptVo;
    }

    @Override
    public List<DeptVo> selectDept() {

        return deptDao.selectDept();
    }

    @Override
    public List<DeptVo> selectDepts() {

        return deptDao.selectDepts();
    }
    @Override
    public List<DeptVo> selectDeptlike(String likeke) {

        return deptDao.selectDeptlike(likeke);
    }
}

package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.SystemDao;
import com.trkj.tsm.entity.System;
import com.trkj.tsm.service.SystSevice;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.SystemVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class SystSeviceImpl implements SystSevice {
    @Resource
    private SystemDao systemDao;

    @Override
    public List<SystemVo> selectAllSystem(String flag) {
        return systemDao.selectAllSystem(flag);
    }

    @Override
    public SystemVo addsSystem(SystemVo systemVo) {
        log.debug("新增企业档案信息");
        System d = new System();
        BeanCopyUtil.copyProperties(systemVo, d);
        systemDao.insert(d);
        return systemVo;
    }

    @Override
    public int deleteSystem(Integer systemId) {
        log.debug("删除教室信息成功");
        SystemVo systemVo=new SystemVo();
        systemVo.setSystemId(systemId);
        systemVo.setTimeliness(1);
        return systemDao.updateByPrimaryKeySelective(systemVo);
    }

    @Override
    public SystemVo updateByPrimaryKey1(SystemVo systemVo) {
        log.debug("删除");
        SystemVo d = new SystemVo();
        BeanCopyUtil.copyProperties(systemVo,d);
        systemDao.updateByPrimaryKey1(d);
        return systemVo;
    }

    @Override
    public SystemVo updateSysyem(SystemVo systemVo) {
        log.debug("修改到了");
        SystemVo d = new SystemVo();
        BeanCopyUtil.copyProperties(systemVo, d);
        systemDao.updateByPrimaryKeySelective1(d);
        return systemVo;
    }

    @Override
    public SystemVo updateByPrimaryKey2(SystemVo systemVo) {
        log.debug("改变状态为1");
        SystemVo d = new SystemVo();
        BeanCopyUtil.copyProperties(systemVo, d);
        systemDao.updateByPrimaryKey2(d);
        return systemVo;
    }

    @Override
    public SystemVo updateByPrimaryKey3(SystemVo systemVo) {
        log.debug("改变状态为2");
        SystemVo d = new SystemVo();
        BeanCopyUtil.copyProperties(systemVo, d);
        systemDao.updateByPrimaryKey3(d);
        return systemVo;
    }
}

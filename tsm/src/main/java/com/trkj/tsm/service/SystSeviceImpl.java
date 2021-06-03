package com.trkj.tsm.service;

import com.trkj.tsm.dao.SystemDao;
import com.trkj.tsm.entity.System;
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
    public List<SystemVo> selectAllSystem() {
        return systemDao.selectAllSystem();
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
        System system=new System();
        system.setSystemId(systemId);
        system.setTimeliness(1);
        return systemDao.updateByPrimaryKeySelective(system);
    }

}

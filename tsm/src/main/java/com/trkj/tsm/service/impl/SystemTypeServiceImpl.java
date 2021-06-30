package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.SystemtypeDao;
import com.trkj.tsm.entity.Systemtype;
import com.trkj.tsm.service.SystemTypeService;
import com.trkj.tsm.util.BeanCopyUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class SystemTypeServiceImpl implements SystemTypeService {
    @Resource
    private SystemtypeDao systemtypeDao;

    @Override
    public List<Systemtype> selectAlls2() {
        log.debug("分页查询所有");
        return systemtypeDao.selectAlls2();
    }

    @Override
    public List<Systemtype> selectAlls9() {
        return systemtypeDao.selectAlls9();
    }

    @Override
    public Systemtype addSysyemtype(Systemtype systemtype) {
        log.debug("新增信息");
        Systemtype d = new Systemtype();
        systemtype.setAddname("adianm");
        BeanCopyUtil.copyProperties(systemtype, d);
        systemtypeDao.insert(d);
        return systemtype;
    }

    @Override
    public Systemtype updateSysyemtype(Systemtype systemtype) {
        log.debug("修改到了");
        Systemtype d = new Systemtype();
        systemtype.setUpdatename("adianm");
        BeanCopyUtil.copyProperties(systemtype, d);
        systemtypeDao.updateByPrimaryKey(d);
        return systemtype;
    }

    @Override
    public List<Systemtype> selectSysyemtype(String systemtypeName) {
        log.debug("查询");
        return systemtypeDao.selectByPrimaryKey(systemtypeName);
    }

    @Override
    public int updateByPrimaryKehciuj(Integer systemtypeId) {
            log.debug("删除教室信息成功");
            Systemtype systemtype=new Systemtype();
            systemtype.setDeletename("adianm");
            return systemtypeDao.updateByPrimaryKehciuj(systemtype);
    }
}

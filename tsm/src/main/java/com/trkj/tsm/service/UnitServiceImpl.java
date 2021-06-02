package com.trkj.tsm.service;

import com.trkj.tsm.dao.UnitDao;
import com.trkj.tsm.entity.Unit;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.UnitVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class UnitServiceImpl implements UnitService {
    @Resource
    private UnitDao unitDao;
    @Override
    public int deleteByPrimaryKey(Integer unitId) {
        return unitDao.deleteByPrimaryKey(unitId);
    }

    @Override
    public UnitVo insert(UnitVo unitVo) {
        Unit u = new Unit();
        BeanCopyUtil.copyProperties(unitVo,u);
        u.setUnittypeId(unitVo.getUnittype().getUnittypeId());
        unitDao.insert(u);
        return unitVo;
    }

    @Override
    public int selectByPrimaryKey(Integer unitId) {

        return unitDao.selectByPrimaryKey(unitId);
    }

    @Override
    public UnitVo updateByPrimaryKey(UnitVo unitVo) {
        Unit u = new Unit();
        BeanCopyUtil.copyProperties(unitVo,u);
        u.setUnittypeId(unitVo.getUnittype().getUnittypeId());
        unitDao.updateByPrimaryKey(u);
        log.debug(unitVo.toString());

        return unitVo;
    }

    @Override
    public List<UnitVo> selectUnit() {

        return unitDao.selectUnit();
    }
}

package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.UnittypeDao;
import com.trkj.tsm.entity.Enterprise;
import com.trkj.tsm.entity.Unittype;
import com.trkj.tsm.service.UnittypeService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.PositionVo;
import com.trkj.tsm.vo.UnittypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class UnittypeServiceImpl implements UnittypeService {
    @Resource
    private UnittypeDao unittypeDao;
    @Override
    public int deleteByPrimaryKey(Integer unittypeId) {
        log.debug("进行删除业务");
        return unittypeDao.deleteByPrimaryKey(unittypeId);
    }
    @Override
    public int selectByPrimaryKey(Integer unittypeId) {
        log.debug("进行id查询业务");
        return unittypeDao.deleteByPrimaryKey(unittypeId);
    }
    @Override
    public UnittypeVo insert(UnittypeVo unittypeVo) {
        log.debug("新增单位类型信息");
        Unittype d = new Unittype();
        BeanCopyUtil.copyProperties(unittypeVo,d);
        unittypeDao.insert(d);
        return unittypeVo;
    }

    @Override
    public UnittypeVo updateByPrimaryKey(UnittypeVo unittypeVo) {
        log.debug("进行修改业务");
        Unittype d = new Unittype();
        BeanCopyUtil.copyProperties(unittypeVo,d);
        unittypeDao.updateByPrimaryKey(d);
        return unittypeVo;
    }

    @Override
    public List<UnittypeVo> selectUnittype() {
        log.debug("进行分页查询业务");
        return unittypeDao.selectUnittype();
    }

    @Override
    public List<UnittypeVo> selectUnittypes() {
        log.debug("进行分页查询业务");
        return unittypeDao.selectUnittype();
    }

    @Override
    public List<UnittypeVo> selectPositionlike(String likeke) {

        return unittypeDao.selectfindslike(likeke);
    }
}

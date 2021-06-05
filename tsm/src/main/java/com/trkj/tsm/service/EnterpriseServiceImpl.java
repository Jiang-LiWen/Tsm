package com.trkj.tsm.service;

import com.trkj.tsm.dao.EnterpriseDao;
import com.trkj.tsm.entity.Enterprise;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.EnterpriseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EnterpriseServiceImpl implements EnterpriseService {
    @Autowired
    private EnterpriseDao enterpriseDao;

    @Override
    public List<Enterprise> selectfinds() {
        log.debug("controller查询全部信息");
        return enterpriseDao.selectfinds();
    }

    @Override
    @Caching(evict = {@CacheEvict(value = "alldepts", allEntries = true)},
            put = {@CachePut(value = "enterprise", key = "#enterpriseVo.getEnterpriseId()")})
    public EnterpriseVo addEnterprise(EnterpriseVo enterpriseVo) {
        log.debug("新增企业档案信息");
        Enterprise d = new Enterprise();
        BeanCopyUtil.copyProperties(enterpriseVo, d);
        enterpriseDao.insert(d);
        return enterpriseVo;
    }

    @Override
    public EnterpriseVo updateEnterprise(EnterpriseVo enterpriseVo) {
        log.debug("修改企业档案信息");
        Enterprise d = new Enterprise();
        BeanCopyUtil.copyProperties(enterpriseVo, d);
        enterpriseDao.updateByPrimaryKey(d);
        return enterpriseVo;
    }

    @Override
    public int deleteEnterprise(Integer enterpriseId) {
        log.debug("删除企业档案信息");
        return enterpriseDao.deleteByPrimaryKey(enterpriseId);
    }

    @Override
    public Enterprise selectEnterprise(Integer enterpriseId) {
        log.debug("根据id查询企业档案信息");
        return enterpriseDao.selectByPrimaryKey(enterpriseId);
    }
}

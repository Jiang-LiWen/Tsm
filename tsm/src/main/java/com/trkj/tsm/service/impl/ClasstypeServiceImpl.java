package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.ClasstypeDao;
import com.trkj.tsm.entity.Classtype;
import com.trkj.tsm.service.ClasstypeService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.ClasstypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class ClasstypeServiceImpl implements ClasstypeService {
    @Resource
    private ClasstypeDao classtypeDao;

//    @Override
//    @Caching(evict = {@CacheEvict( value = "alldepts",allEntries = true)},
//            put={@CachePut(value = "classtype",key = "#enterpriseVo.getEnterpriseId()")})
    public ClasstypeVo addClasstype(ClasstypeVo classtypeVo) {
        log.debug("新增课程类别信息");
        Classtype d = new Classtype();
        BeanCopyUtil.copyProperties(classtypeVo,d);
        classtypeDao.insert(d);
        return classtypeVo;
    }

    @Override
    public ClasstypeVo updateClasstype(ClasstypeVo classtypeVo) {
        log.debug("修改课程类别信息");
        Classtype d = new Classtype();
        BeanCopyUtil.copyProperties(classtypeVo,d);
        classtypeDao.updateByPrimaryKey(d);
        return classtypeVo;
    }

    @Override
    public List<ClasstypeVo> selectfinds() {
        return classtypeDao.selectfinds();
    }

    @Override
    public List<ClasstypeVo> selectfindslike(String likeke) {
        return classtypeDao.selectfindslike(likeke);
    }
}

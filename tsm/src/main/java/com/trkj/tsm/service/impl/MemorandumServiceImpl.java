package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.MemorandumDao;
import com.trkj.tsm.entity.Memorandum;
import com.trkj.tsm.service.MemorandumService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.MemorandumVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class MemorandumServiceImpl implements MemorandumService {
    @Autowired
    @Resource
    private MemorandumDao memorandumDao;

    @Override
    public List<MemorandumVo> selectByPrimaryKey() {

        return memorandumDao.selectByPrimaryKey();
    }

    @Override
    public int deleteMemorandum(Integer memorandumid) {
        log.debug("删除备忘录成功");
        return memorandumDao.deleteByPrimaryKey(memorandumid);
    }

    @Override
    @Caching(evict = {@CacheEvict(value = "alldepts", allEntries = true)},
            put = {@CachePut(value = "Memorandum", key = "#memorandumVo.getMemorandumId()")})
    public MemorandumVo addMemorandum(MemorandumVo memorandumVo) {
        log.debug("新增备忘录信息");
        Memorandum m = new Memorandum();
        BeanCopyUtil.copyProperties(memorandumVo, m);
        memorandumVo.setStarttime(new Date());
        memorandumDao.insertSelective(m);
        return memorandumVo;
    }

    @Override
    public MemorandumVo updataMemorandum(MemorandumVo memorandumVo) {
        log.debug("修改备忘录信息");
        Memorandum m = new Memorandum();
        BeanCopyUtil.copyProperties(memorandumVo, m);
        memorandumDao.updateByPrimaryKey(m);
        return memorandumVo;

    }

    @Override
    public List<MemorandumVo> selectMemorandum(String value11, String value1) {
        log.debug(value1);
        log.debug(value11);
        return memorandumDao.selectMemorandum(value11,value1);
    }
}

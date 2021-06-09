package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.DaillogDao;
import com.trkj.tsm.entity.Daillog;
import com.trkj.tsm.service.DaillogService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.DaillogVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DaillogServiceImpl implements DaillogService {
    @Autowired
    private DaillogDao daillogDao;
    @Override
    public List<DaillogVo> selectByPrimaryKey() {

        return daillogDao.selectByPrimaryKey();
    }

    @Override
    public int deledaillog(Integer daillogId) {
        log.debug("删除工作表成功");
        return daillogDao.deleteByPrimaryKey(daillogId);
    }

    @Override

    public DaillogVo addDaillog(DaillogVo daillogVo) {
        log.debug("新增工作表");
        Daillog d=new Daillog();
        BeanCopyUtil.copyProperties(daillogVo,d);
        daillogDao.insertSelective(d);
        return daillogVo;
    }
}

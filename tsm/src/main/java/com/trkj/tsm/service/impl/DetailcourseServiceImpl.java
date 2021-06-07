package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.DetailcourseDao;
import com.trkj.tsm.service.DetailcourseService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.DetailcourseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class DetailcourseServiceImpl implements DetailcourseService {
    @Resource
    private DetailcourseDao detailcourseDao;

    @Override
    public List<DetailcourseVo> selectByCourseId(int courseid) {
        return detailcourseDao.selectByCourseId(courseid);
    }

    @Override
    public DetailcourseVo updDetailcourseTimeless(DetailcourseVo detailcourseVo) {
        log.debug("删除课时信息");
        DetailcourseVo d = new DetailcourseVo();
        BeanCopyUtil.copyProperties(detailcourseVo,d);
        detailcourseDao.updDetailcourseTimeless(d);
        return detailcourseVo;
    }

    @Override
    public DetailcourseVo updDetailcourse(DetailcourseVo detailcourseVo) {
        log.debug("删除课时信息");
        DetailcourseVo d = new DetailcourseVo();
        BeanCopyUtil.copyProperties(detailcourseVo,d);
        detailcourseDao.updDetailcourse(d);
        return detailcourseVo;
    }

    @Override
    public DetailcourseVo insertDetailcourse(DetailcourseVo detailcourseVo) {
        log.debug("添加课时信息");
        DetailcourseVo d = new DetailcourseVo();
        BeanCopyUtil.copyProperties(detailcourseVo,d);
        detailcourseDao.insertDetailcourse(d);
        return detailcourseVo;
    }
}

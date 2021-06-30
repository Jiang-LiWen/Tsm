package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.DetailcourseDao;
import com.trkj.tsm.entity.Detailcourse;
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
    public List<Detailcourse> selectBypp(int courseId, int serial) {
        log.debug("DetailcourseService:查找课时----------------------------------------------------");
        List<Detailcourse> detailcourse=detailcourseDao.selectBypp(courseId,serial);
        return detailcourse;
    }

    @Override
    public Detailcourse selectById(int detailcourseId) {
        log.debug("DetailcourseService:根据Id查找课时----------------------------------------------------");
        Detailcourse detailcourse=detailcourseDao.selectById(detailcourseId);
        return detailcourse;
    }

    @Override
    public List<DetailcourseVo> selectByCourseId(int courseid) {
        return detailcourseDao.selectByCourseId(courseid);
    }

    @Override
    public List<DetailcourseVo> selectByPrimaryKey() {
        log.debug("显示课程详细");
        return detailcourseDao.selectByPrimaryKey();
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

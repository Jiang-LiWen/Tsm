package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.ClassroomDao;
import com.trkj.tsm.entity.Classroom;
import com.trkj.tsm.service.ClassroomService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.ClassroomVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class ClassroomServiceImpl implements ClassroomService {
    @Resource
    private ClassroomDao classroomDao;

    @Override
    public List<Classroom> selectAlls() {
        log.debug("controller查询全部信息");
        return classroomDao.selectAlls();
    }


  @Override
    @Caching(evict = {@CacheEvict(value = "alldepts", allEntries = true)},
            put = {@CachePut(value = "classroom", key = "#classroomVo.getClassroomId()")})
    public ClassroomVo addClassroom(ClassroomVo classroomVo) {
        log.debug("新增企业档案信息");
        Classroom d = new Classroom();
        /*classroomVo.setAddname("Admin");*/
        BeanCopyUtil.copyProperties(classroomVo, d);
        classroomDao.insert(d);
        return classroomVo;
    }
    @Override
    public ClassroomVo updateClassroom(ClassroomVo classroomVo) {
        log.debug("修改到了");
        log.debug(classroomVo.toString());
        Classroom d = new Classroom();
        BeanCopyUtil.copyProperties(classroomVo, d);
        classroomDao.updateByPrimaryKey(d);
        return classroomVo;
    }

    @Override
    public int deleteClassroom(Integer ClassroomId) {
        log.debug("删除教室信息成功");
        Classroom classroom=new Classroom();
        classroom.setClassroomId(ClassroomId);
        classroom.setTimeliness(1);
        return classroomDao.updateByPrimaryKeySelective(classroom);
    }

    @Override
    public List<Classroom> selectClassroom(String classroomName) {
            log.debug("查询");
            return classroomDao.selectByPrimaryKey(classroomName);
    }
}

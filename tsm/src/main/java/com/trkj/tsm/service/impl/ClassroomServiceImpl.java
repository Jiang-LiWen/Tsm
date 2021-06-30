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
    public List<Classroom> selectAllsClassRoom() {
        log.debug("ClassroomService:查找所有未过期的教室信息-----------------------------------------");
        return classroomDao.selectAllsClassRoom();
    }

    @Override
    public List<Classroom> selectAlls(String flag) {
        log.debug("controller查询全部信息");
        return classroomDao.selectAlls(flag);
    }


  @Override
    public ClassroomVo addClassroom(ClassroomVo classroomVo) {
        log.debug("新增企业档案信息");
        Classroom d = new Classroom();
        classroomVo.setAddname("Admin");
        BeanCopyUtil.copyProperties(classroomVo, d);
        classroomDao.addClassroom(d);
        return classroomVo;
    }



    @Override
    public ClassroomVo updateClassroom(ClassroomVo classroomVo) {
        log.debug(classroomVo.toString());
        ClassroomVo d = new ClassroomVo();
        BeanCopyUtil.copyProperties(classroomVo, d);
        classroomDao.updateClassroom(d);
        return classroomVo;
    }

    @Override
    public int deleteClassroom(Integer ClassroomId) {
        log.debug("删除教室信息成功");
        ClassroomVo classroomVo=new ClassroomVo();
        classroomVo.setClassroomId(ClassroomId);
        classroomVo.setTimeliness(1);
        return classroomDao.updateByPrimaryKeySelective(classroomVo);
    }

    @Override
    public ClassroomVo updateByPrimaryKey(ClassroomVo classroomVo) {
        log.debug("删除");
        ClassroomVo d = new ClassroomVo();
        BeanCopyUtil.copyProperties(classroomVo,d);
        classroomDao.updateByPrimaryKey(d);
        return classroomVo;
    }
}

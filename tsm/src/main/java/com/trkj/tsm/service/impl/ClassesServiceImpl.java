package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.ClassesDao;
import com.trkj.tsm.entity.Classes;
import com.trkj.tsm.service.ClassesService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.ClassesVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class ClassesServiceImpl implements ClassesService {
    @Resource
    private ClassesDao classesDao;

    @Override
    public List<Classes> selectClassesOpen1() {
        return classesDao.selectClassesOpen1();
    }

    @Override
    public List<Classes> selectClassesOpen() {
        return classesDao.selectClassesOpen();
    }

    @Override
    public Classes selectClassesBycid(int cid) {
        Classes classes=classesDao.selectClassesBycid(cid);
        return classes;
    }

    @Override
    public List<ClassesVo> selectAllClasses(String likeke) {
        return classesDao.selectAllClasses(likeke);
    }

    @Override
    public ClassesVo updateClasses_Open(ClassesVo classesVo) {
        log.debug("开班修改");
        Classes d = new Classes();
        BeanCopyUtil.copyProperties(classesVo,d);
        classesDao.updateClasses_Open(d);
        return classesVo;
    }

    @Override
    public ClassesVo updateClasses_State(ClassesVo classesVo) {
        log.debug("毕业修改");
        Classes d = new Classes();
        BeanCopyUtil.copyProperties(classesVo,d);
        classesDao.updateClasses_State(d);
        return classesVo;
    }

    @Override
    public ClassesVo updateClasses(ClassesVo classesVo) {
        log.debug("修改班级");
        Classes d = new Classes();
        BeanCopyUtil.copyProperties(classesVo,d);
        classesDao.updateClasses(d);
        return classesVo;
    }

    @Override
    public ClassesVo updateClassesDC(ClassesVo classesVo) {
        log.debug("修改班级");
        Classes d = new Classes();
        BeanCopyUtil.copyProperties(classesVo,d);
        classesDao.updateClassesDC(d);
        return classesVo;
    }

    @Override
    public ClassesVo deleteClasses(ClassesVo classesVo) {
        log.debug("删除班级");
        Classes d = new Classes();
        BeanCopyUtil.copyProperties(classesVo,d);
        classesDao.deleteClasses(d);
        return classesVo;
    }

    @Override
    public ClassesVo insertClasses(ClassesVo classesVo) {
        log.debug("添加班级");
        Classes d = new Classes();
        BeanCopyUtil.copyProperties(classesVo,d);
        classesDao.insertClasses(d);
        return classesVo;
    }

    @Override
    public Classes updateClassesRCount(Classes classes) {
        log.debug("修改班级实际人数");
        classesDao.updateClassesRCount(classes);
        return classes;
    }
}

package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.StudentstatusDao;
import com.trkj.tsm.entity.Studentstatus;
import com.trkj.tsm.service.StudentstatusService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.StudentstatusVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class StudentstatusServiceImpl implements StudentstatusService {
    @Resource
    private StudentstatusDao studentstatusDao;
    @Override
    public Studentstatus selectStudentstatusId(Integer Id) {
        return studentstatusDao.selectStudentstatusId(Id);
    }

    @Override
    public List<StudentstatusVo> selectStudentstatusLike(String likeke1,String likeke2) {
        return studentstatusDao.selectStudentstatusLike(likeke1,likeke2);
    }

    @Override
    public StudentstatusVo deleteStudentstatus(StudentstatusVo studentstatusVo) {
        log.debug("学员状态删除");
        Studentstatus d = new Studentstatus();
        BeanCopyUtil.copyProperties(studentstatusVo,d);
        studentstatusDao.deleteStudentstatus(d);
        return studentstatusVo;
    }

    @Override
    public Studentstatus insertStudentstatus(Studentstatus studentstatus) {
        log.debug("学员状态添加");

        studentstatusDao.insertStudentstatus(studentstatus);
        return studentstatus;
    }

    @Override
    public StudentstatusVo updateStudentstatus(StudentstatusVo studentstatusVo) {
        log.debug("学员状态修改");
        Studentstatus d = new Studentstatus();
        BeanCopyUtil.copyProperties(studentstatusVo,d);
        studentstatusDao.updateStudentstatus(d);
        return studentstatusVo;
    }
}

package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.StudentDao;
import com.trkj.tsm.entity.Student;
import com.trkj.tsm.service.StudentService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.StudentVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public int insertStudent(Student student) {
        log.debug("学员添加");
        int studentid=studentDao.insertStudent(student);
        return studentid;
    }

    @Override
    public List<StudentVo> selectStudentLike(String likeke) {
        return studentDao.selectStudentLike(likeke);
    }

    @Override
    public StudentVo updateStudent(StudentVo studentVo) {
        log.debug("学员修改");
        Student d = new Student();
        BeanCopyUtil.copyProperties(studentVo,d);
        studentDao.updateStudent(d);
        return studentVo;
    }

    @Override
    public StudentVo deleteStudent(StudentVo studentVo) {
        log.debug("学员删除");
        Student d = new Student();
        BeanCopyUtil.copyProperties(studentVo,d);
        studentDao.deleteStudent(d);
        return studentVo;
    }
}

package com.trkj.tsm.service;

import com.trkj.tsm.entity.Book;
import com.trkj.tsm.entity.Student;
import com.trkj.tsm.vo.BookVo;
import com.trkj.tsm.vo.StudentVo;

import java.util.List;

public interface StudentService {
    int insertStudent(Student student);//添加学员

    List<StudentVo> selectStudentLike(String likeke);//页面显示加分页查询

    StudentVo updateStudent(StudentVo studentVo);//修改学员

    StudentVo deleteStudent(StudentVo studentVo);//删除学员

    List<Student> wjselectAllsStudet();

    Student wjselectByPrimaryKeystudent(Integer studentId);
}

package com.trkj.tsm.dao;


import com.trkj.tsm.entity.Student;
import com.trkj.tsm.vo.StudentVo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface StudentDao {
    int insertStudent(Student record);//添加学员

    List<StudentVo> selectStudentLike(String likeke);//页面显示加分页查询

    int updateStudent(Student record);//修改学员

    int deleteStudent(Student record);//删除学员

//    int deleteByPrimaryKey(Integer studentId);
//
//    int insert(Student record);
//
//    int insertSelective(Student record);
//
//    Student selectByPrimaryKey(Integer studentId);
//
//    int updateByPrimaryKeySelective(Student record);
//
//    int updateByPrimaryKey(Student record);
}
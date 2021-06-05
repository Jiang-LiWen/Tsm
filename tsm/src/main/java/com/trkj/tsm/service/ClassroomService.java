package com.trkj.tsm.service;



import com.trkj.tsm.entity.Classroom;
import com.trkj.tsm.vo.ClassroomVo;

import java.util.List;


public interface ClassroomService {
    List<Classroom> selectAlls();

    ClassroomVo addClassroom(ClassroomVo classroomVo);

    ClassroomVo updateClassroom(ClassroomVo classroomVo);

    int deleteClassroom(Integer ClassroomId);//删除

    List<Classroom> selectClassroom(String classroomName);

    ClassroomVo updateByPrimaryKey(ClassroomVo classroomVo);
}

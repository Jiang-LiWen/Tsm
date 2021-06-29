package com.trkj.tsm.service;

import com.trkj.tsm.entity.Studentstatus;
import com.trkj.tsm.vo.StudentstatusVo;

import java.util.List;

public interface StudentstatusService {
    Studentstatus selectStudentstatusId(Integer Id);//通过学员id找学员状态

    List<StudentstatusVo> selectStudentstatusLike(String likeke1,String likeke2);//学员状态模糊查询

    StudentstatusVo deleteStudentstatus(StudentstatusVo studentstatusVo);//删除学员状态

    Studentstatus insertStudentstatus(Studentstatus studentstatus);//添加学员状态

    StudentstatusVo updateStudentstatus(StudentstatusVo studentstatusVo);//学员状态
}

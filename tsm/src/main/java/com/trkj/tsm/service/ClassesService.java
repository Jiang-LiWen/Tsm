package com.trkj.tsm.service;

import com.trkj.tsm.entity.Classes;
import com.trkj.tsm.vo.ClassesVo;

import java.util.List;

public interface ClassesService {

    List<Classes> selectClassesOpen1();//开班查询

    List<Classes> selectClassesOpen();//未开班查询

    Classes selectClassesBycid(int cid);//班级查询

    List<ClassesVo> selectAllClasses(String likeke);//页面显示加分页查询

    ClassesVo updateClasses_Open(ClassesVo classesVo);//开班修改

    ClassesVo updateClasses_State(ClassesVo classesVo);//毕业修改

    ClassesVo updateClasses(ClassesVo classesVo);//修改班级

    ClassesVo deleteClasses(ClassesVo classesVo);//删除班级

    ClassesVo insertClasses(ClassesVo classesVo);//添加班级

    Classes updateClassesRCount(Classes classes);//修改班级实际人数
}

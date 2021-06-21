package com.trkj.tsm.service;

import com.trkj.tsm.entity.Classes;
import com.trkj.tsm.vo.ClassesVo;

import java.util.List;

public interface ClassesService {
    Classes selectClassesBycid(int cid);//班级查询

    List<ClassesVo> selectAllClasses(String likeke);//页面显示加分页查询

    ClassesVo updateClasses_Open(ClassesVo classesVo);//开班修改

    ClassesVo updateClasses_State(ClassesVo classesVo);//毕业修改

    ClassesVo updateClasses(ClassesVo classesVo);//修改班级

    ClassesVo deleteClasses(ClassesVo classesVo);//删除班级

    ClassesVo insertClasses(ClassesVo classesVo);//添加班级
}

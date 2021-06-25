package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Classes;
import com.trkj.tsm.vo.ClassesVo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ClassesDao {
    List<Classes> selectClassesOpen1();//开班查询

    List<Classes> selectClassesOpen();//未开班查询

    Classes selectClassesBycid(int cid);//班级查询

    List<ClassesVo> selectAllClasses(String likeke);//页面显示加分页查询

    int updateClasses_Open(Classes record);//开班修改

    int updateClasses_State(Classes record);//毕业修改

    int updateClasses(Classes record);//修改班级

    int deleteClasses(Classes record);//删除班级

    int insertClasses(Classes record);//添加班级

    int updateClassesRCount(Classes record);//修改班级实际人数
}
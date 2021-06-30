package com.trkj.tsm.dao;


import com.trkj.tsm.entity.Detailcourse;
import com.trkj.tsm.vo.DetailcourseVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DetailcourseDao {
    List<Detailcourse> selectBypp(int courseId,int serial);//找剩余课时

    Detailcourse selectById(int detailcourseId);//根据id来找课时

    List<DetailcourseVo> selectByCourseId(int courseid);//查找课程对应的课时内容

    int updDetailcourseTimeless(DetailcourseVo record);//课时删除

    int updDetailcourse(DetailcourseVo record);//课时修改

    int insertDetailcourse(DetailcourseVo record);//添加课时

    List<DetailcourseVo> selectByPrimaryKey();
//    int deleteByPrimaryKey(Integer detailcourseId);
//
//    int insert(Detailcourse record);
//
//    int insertSelective(Detailcourse record);
//
//    Detailcourse selectByPrimaryKey(Integer detailcourseId);
//
//    int updateByPrimaryKeySelective(Detailcourse record);
//
//    int updateByPrimaryKey(Detailcourse record);

}
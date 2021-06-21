package com.trkj.tsm.dao;


import com.trkj.tsm.vo.DetailcourseVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DetailcourseDao {
    List<DetailcourseVo> selectByCourseId(int courseid);//查找课程对应的课时内容

    int updDetailcourseTimeless(DetailcourseVo record);//课时删除

    int updDetailcourse(DetailcourseVo record);//课时修改

    int insertDetailcourse(DetailcourseVo record);//添加课时

}
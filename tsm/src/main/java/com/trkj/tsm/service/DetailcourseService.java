package com.trkj.tsm.service;

import com.trkj.tsm.vo.DetailcourseVo;

import java.util.List;

public interface DetailcourseService {
    List<DetailcourseVo> selectByCourseId(int courseid);//查找课程对应的课时内容

    DetailcourseVo updDetailcourseTimeless(DetailcourseVo detailcourseVo);//课时删除

    DetailcourseVo updDetailcourse(DetailcourseVo detailcourseVo);//课时修改

    DetailcourseVo insertDetailcourse(DetailcourseVo detailcourseVo);//添加课时

    List<DetailcourseVo> selectByPrimaryKey();
}

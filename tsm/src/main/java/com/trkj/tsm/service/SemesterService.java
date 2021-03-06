package com.trkj.tsm.service;

import com.trkj.tsm.entity.Semester;
import com.trkj.tsm.vo.SemesterVo;
import com.trkj.tsm.vo.SessionVo;

import java.util.List;

public interface SemesterService {
    int deleteByPrimaryKey(Integer semesterId);

    SemesterVo insert(SemesterVo semestervo);

    int selectByPrimaryKey(Integer semesterId);

    SemesterVo updateByPrimaryKey(SemesterVo semesterVo);

    List<SemesterVo> selectSemester();

    List<SemesterVo> selectfindslike(String likeke);
}

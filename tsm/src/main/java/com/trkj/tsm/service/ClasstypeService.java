package com.trkj.tsm.service;

import com.trkj.tsm.vo.ClasstypeVo;

import java.util.List;

public interface ClasstypeService {
    ClasstypeVo addClasstype(ClasstypeVo classtypeVo);

    ClasstypeVo updateClasstype(ClasstypeVo classtypeVo);

    List<ClasstypeVo> selectfinds();

    List<ClasstypeVo> selectfindslike(String likeke);
}

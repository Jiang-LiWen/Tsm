package com.trkj.tsm.service;

import com.trkj.tsm.entity.Dept;
import com.trkj.tsm.vo.DeptVo;

import java.util.List;

public interface DeptService {
    int deleteByPrimaryKey(Integer deptId);

    DeptVo updateDeptTimeliness(DeptVo deptVo);//批量删除

    DeptVo insert(DeptVo deptVo);

    DeptVo updateByPrimaryKey(DeptVo deptVo);

    List<DeptVo> selectDept();

    List<DeptVo> selectDepts();

    List<DeptVo> selectDeptlike(String likeke);//页面显示加分页模糊查询
}

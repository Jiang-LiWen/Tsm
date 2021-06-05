package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Dept;
import com.trkj.tsm.vo.DeptVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    int deleteByPrimaryKey(Integer deptId);

    int updateDeptTimeliness(Dept dept);//批量删除

    int insert(Dept dept);

    int updateByPrimaryKey(Dept dept);

    List<DeptVo> selectDept();

    List<DeptVo> selectDepts();

    List<DeptVo> selectDeptss();

    List<DeptVo> selectDeptlike(String likeke);//页面显示加分页模糊查询
}

package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Dept;
import com.trkj.tsm.entity.Emp;
import com.trkj.tsm.vo.EmpVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpDao {
    int deleteByPrimaryKey(Integer empId);

    int insert(Emp emp);

    int updateByPrimaryKey(Emp emp);

    int updateEmpTimeliness(Emp emp);//批量删除

    List<EmpVo> selectEmp();

    List<EmpVo> selectEmpLike(String likeke);
}
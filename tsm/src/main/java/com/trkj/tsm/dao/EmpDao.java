package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Dept;
import com.trkj.tsm.entity.Emp;
import com.trkj.tsm.vo.EmpVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpDao {
    List<EmpVo> ClassesselectEmp1();//班级找班主任

    List<EmpVo> ClassesselectEmp2();//班级找教员

    int deleteByPrimaryKey(Integer empId);

    int insert(Emp emp);

    int updateByPrimaryKey(Emp emp);

    int updateEmpTimeliness(Emp emp);//批量删除

    List<EmpVo> selectEmp();

    List<EmpVo> selectEmpLike(String likeke);

    Emp findByUsername(String username);
}
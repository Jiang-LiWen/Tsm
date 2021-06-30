package com.trkj.tsm.service;

import com.trkj.tsm.entity.Emp;
import com.trkj.tsm.vo.EmpVo;

import java.util.List;

public interface EmpService {
    List<EmpVo> ClassesselectEmp1();//班级找班主任

    List<EmpVo> ClassesselectEmp2();//班级找教员

    int deleteByPrimaryKey(Integer empId);

    EmpVo insert(EmpVo empVo);

    EmpVo updateByPrimaryKey(EmpVo empVo);

    EmpVo updateEmpTimeliness(EmpVo empVo);//批量删除

    List<EmpVo> selectEmp();

    List<EmpVo> selectEmpLike(String likeke);

    public EmpVo findByUsername(String username);

    List<EmpVo> selectEmp1();
}

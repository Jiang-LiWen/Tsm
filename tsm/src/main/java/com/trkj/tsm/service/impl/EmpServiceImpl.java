package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.EmpDao;
import com.trkj.tsm.entity.Emp;
import com.trkj.tsm.service.EmpService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.EmpVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empDao;
    @Override
    public int deleteByPrimaryKey(Integer empId) {
        return empDao.deleteByPrimaryKey(empId);
    }

    @Override
    public EmpVo insert(EmpVo empVo) {
        Emp e  = new Emp();
        BeanCopyUtil.copyProperties(empVo,e);
        e.setDeptId(empVo.getDept().getDeptId());
        e.setPositionId(empVo.getPosition().getPositionId());
        e.setEnterpriseId(empVo.getEnterprise().getEnterpriseId());
        empDao.insert(e);
        return empVo;
    }

    @Override
    public EmpVo updateByPrimaryKey(EmpVo empVo) {
        Emp e  = new Emp();
        BeanCopyUtil.copyProperties(empVo,e);
        e.setDeptId(empVo.getDept().getDeptId());
        e.setPositionId(empVo.getPosition().getPositionId());
        e.setEnterpriseId(empVo.getEnterprise().getEnterpriseId());
        empDao.updateByPrimaryKey(e);
        return empVo;
    }

    @Override
    public EmpVo updateEmpTimeliness(EmpVo empVo) {
        Emp e  = new Emp();
        BeanCopyUtil.copyProperties(empVo,e);
        empDao.updateEmpTimeliness(e);
        return empVo;
    }

    @Override
    public List<EmpVo> selectEmp() {

        return empDao.selectEmp();
    }

    @Override
    public List<EmpVo> selectEmpLike(String likeke) {

        return empDao.selectEmpLike(likeke);
    }
}

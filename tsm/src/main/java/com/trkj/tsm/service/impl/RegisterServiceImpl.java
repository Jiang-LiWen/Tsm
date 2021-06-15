package com.trkj.tsm.service.serviceImpI;

import com.trkj.tsm.dao.RegisterDao;
import com.trkj.tsm.service.RegisterService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.AnnouncementVo;
import com.trkj.tsm.vo.RegisterVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@RestController
@Slf4j
public class RegisterServiceImpl implements RegisterService {
    @Resource
    private RegisterDao registerDao;
    @Override
    public List<RegisterVo> selectRegisterAll() {
        log.debug("咨询登记显示所有");
        return registerDao.selectRegisterAll();
    }

    @Override
    public RegisterVo insertRegister(RegisterVo registerVo) {
        log.debug("咨询登记添加成功");
        log.debug(registerVo.toString());
        registerVo.setEmpId(registerVo.getEmp().getEmpId());
        registerVo.setCourseId(registerVo.getCourse().getCourseId());
        registerVo.setDetailcourseId(registerVo.getDetailcourse().getDetailcourseId());
        registerVo.setSourceId(registerVo.getSource().getSourceId());
        registerDao.insertRegister(registerVo);
        return registerVo;
    }

    @Override
    public RegisterVo updateRegisterTimeLiness(RegisterVo registerVo) {
        log.debug("删除成功(时效性修改成功)ImpI");
        RegisterVo r = new RegisterVo();
        BeanCopyUtil.copyProperties(registerVo,r);
        registerDao.updateRegisterTimeLiness(r);
        return registerVo;
    }

    @Override
    public RegisterVo updateRegister(RegisterVo registerVo) {
        log.debug("修改咨询登记成功ImpI");
        registerVo.setLastupdatetime(new Date());
        registerVo.setEmpId(registerVo.getEmp().getEmpId());
        registerVo.setCourseId(registerVo.getCourse().getCourseId());
        registerVo.setDetailcourseId(registerVo.getDetailcourse().getDetailcourseId());
        registerVo.setSourceId(registerVo.getSource().getSourceId());
        registerDao.updateRegister(registerVo);
        return registerVo;
    }

    @Override
    public List<RegisterVo> selectRegisterSource(String sourceName) {
        log.debug("生源渠道名称查询成功ImpI");
        return registerDao.selectRegisterSource(sourceName);
    }

    @Override
    public List<RegisterVo> selectRegisterCourse(String courseName) {
        log.debug("课程名称查询成功ImpI");
        return registerDao.selectRegisterCourse(courseName);
    }

    @Override
    public List<RegisterVo> selectRegisterEmp(String empName) {
        log.debug("职工姓名查询成功ImpI");
        return registerDao.selectRegisterEmp(empName);
    }

    @Override
    public List<RegisterVo> selectRegisterConsultAnt(String consultantName) {
        log.debug("咨询人查询成功ImpI");
        return registerDao.selectRegisterConsultAnt(consultantName);
    }

    @Override
    public List<RegisterVo> selectRegisterConsultContent(String consultcontent) {
        log.debug("咨询内容查询成功ImpI");
        return registerDao.selectRegisterConsultContent(consultcontent);
    }

    @Override
    public List<RegisterVo> selectRegisterPhone(String phone) {
        log.debug("查询成功ImpI");
        return registerDao.selectRegisterPhone(phone);
    }
}

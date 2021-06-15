package com.trkj.tsm.service;

import com.trkj.tsm.vo.AnnouncementVo;
import com.trkj.tsm.vo.RegisterVo;

import java.util.List;

public interface RegisterService {
//    显示所有咨询
    List<RegisterVo> selectRegisterAll();
//    增加咨询
    RegisterVo insertRegister(RegisterVo registerVo);
//    删除（修改时效性）
    RegisterVo updateRegisterTimeLiness(RegisterVo registerVo);
//    修改
    RegisterVo updateRegister(RegisterVo registerVo);
    //    生源渠道名称分页模糊查询
    List<RegisterVo> selectRegisterSource(String sourceName);
    //    课程名称分页模糊查询
    List<RegisterVo> selectRegisterCourse(String courseName);
    //    职工名称分页模糊查询
    List<RegisterVo> selectRegisterEmp(String empName);
    //    咨询人名称分页模糊查询
    List<RegisterVo> selectRegisterConsultAnt(String consultantName);
    //    咨询内容分页模糊查询
    List<RegisterVo> selectRegisterConsultContent(String consultcontent);
    //    咨询内容分页模糊查询
    List<RegisterVo> selectRegisterPhone(String phone);
}

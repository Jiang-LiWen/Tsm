package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Register;
import com.trkj.tsm.vo.AnnouncementVo;
import com.trkj.tsm.vo.RegisterVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RegisterDao {
//    删除（修改时效性）
    int updateRegisterTimeLiness(RegisterVo registerVo);
//    增加
    int insertRegister(RegisterVo record);
// 显示所有
    List<RegisterVo> selectRegisterAll();
//    修改
    int updateRegister(RegisterVo record);
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
    //    咨询电话分页模糊查询
    List<RegisterVo> selectRegisterPhone(String phone);
}
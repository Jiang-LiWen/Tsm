package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.AttendanceDao;
import com.trkj.tsm.service.AttendanceService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.AttendanceVo;
import com.trkj.tsm.vo.BookVo;
import com.trkj.tsm.vo.ClassroomVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class AttendanceServiceImpl implements AttendanceService {
    @Resource
    private AttendanceDao attendanceDao;

    @Override
    public List<AttendanceVo> selectAllsAttend() {
        log.debug("分页查询所有");
        return attendanceDao.selectAllsAttend();
    }

    @Override
    public AttendanceVo insertsddsas(AttendanceVo attendanceVo) {
        log.debug("新增信息");
        log.debug(attendanceVo.toString()+"%%%%%%%%%%%%%%%%%%%%%%----------impl");
        //根据外键id 查
        attendanceVo.setStudentId(attendanceVo.getStudent().getStudentId());
        attendanceVo.setEmpId(1);
        attendanceVo.setAddname("wang");
        attendanceDao.insertsddsas(attendanceVo);
        return attendanceVo;
    }

    @Override
    public AttendanceVo updateAttendanTimeliness(AttendanceVo attendanceVo) {
        log.debug("删除");
        AttendanceVo d = new AttendanceVo();
        BeanCopyUtil.copyProperties(attendanceVo,d);
        attendanceDao.updateAttendanTimeliness(d);
        return attendanceVo;
    }

    @Override
    public AttendanceVo updateByPrimaryKeySelectivegwesd(AttendanceVo attendanceVo) {
        log.debug(attendanceVo.toString());
        AttendanceVo d = new AttendanceVo();
        BeanCopyUtil.copyProperties(attendanceVo, d);
        attendanceDao.updateByPrimaryKeySelectivegwesd(d);
        return attendanceVo;
    }


}

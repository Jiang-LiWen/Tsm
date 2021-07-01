package com.trkj.tsm.service;

import com.trkj.tsm.vo.AttendanceVo;
import com.trkj.tsm.vo.ClassroomVo;

import java.util.List;

public interface AttendanceService {

    List<AttendanceVo> selectAllsAttend(String flag);

    AttendanceVo insertsddsas(AttendanceVo attendanceVo);

    AttendanceVo updateAttendanTimeliness(AttendanceVo attendanceVo);

    AttendanceVo updateByPrimaryKeySelectivegwesd(AttendanceVo attendanceVo);

    List<AttendanceVo> cdcsdvdtfdfeg(String Starttime,String Endtime );
}

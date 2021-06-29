package com.trkj.tsm.service;

import com.trkj.tsm.vo.AttendanceVo;
import com.trkj.tsm.vo.ClassroomVo;

import java.util.List;

public interface AttendanceService {

    List<AttendanceVo> selectAllsAttend();

    AttendanceVo insertsddsas(AttendanceVo attendanceVo);

    AttendanceVo updateAttendanTimeliness(AttendanceVo attendanceVo);

    AttendanceVo updateByPrimaryKeySelectivegwesd(AttendanceVo attendanceVo);
}

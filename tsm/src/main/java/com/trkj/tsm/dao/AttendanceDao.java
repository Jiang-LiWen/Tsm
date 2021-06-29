package com.trkj.tsm.dao;


import com.trkj.tsm.entity.Emp;
import com.trkj.tsm.vo.AttendanceVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AttendanceDao {
    int deleteByPrimaryKey(Integer attendanceId); //id查询

    AttendanceVo insertsddsas(AttendanceVo attendanceVo);

    int insertSelective(AttendanceVo record);

    AttendanceVo selectByPrimaryKey(Integer attendanceId);

    int updateByPrimaryKeySelectivegwesd(AttendanceVo record);

    int updateByPrimaryKey(AttendanceVo record);

    List<AttendanceVo> selectAllsAttend(); //分页显示所有

    int updateAttendanTimeliness(AttendanceVo attendanceVo);//批量删除




}
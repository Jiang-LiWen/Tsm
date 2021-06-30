package com.trkj.tsm.entity;

import java.io.Serializable;

import com.trkj.tsm.vo.EmpVo;
import lombok.Data;

/**
 * arrange
 * @author 
 */
@Data
public class Arrange implements Serializable {
    /**
     * 排课编号
     */
    private Integer arrangeId;

    /**
     * 时段编号
     */
    private Integer periodId;
    private Trainingperiod trainingperiod;
    /**
     * 班级编号
     */
    private Integer classesId;
    private Classes classes;
    /**
     * 教室编号
     */
    private Integer classroomId;
    private Classroom classroom;
    /**
     * 教师编号
     */
    private Integer teacherId;
    private EmpVo tteacher;
    /**
     * 课程详细编号
     */
    private Integer detailcourseId;
    private Detailcourse detailcourse;
    /**
     * 排课日期
     */
    private String arrangedate;

    private static final long serialVersionUID = 1L;
}
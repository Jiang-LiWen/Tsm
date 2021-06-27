package com.trkj.tsm.entity;

import java.io.Serializable;
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

    /**
     * 班级编号
     */
    private Integer classesId;

    /**
     * 教室编号
     */
    private Integer classroomId;

    /**
     * 教师编号
     */
    private Integer teacherId;

    /**
     * 课程详细编号
     */
    private Integer detailcourseId;

    /**
     * 排课日期
     */
    private String arrangedate;

    private static final long serialVersionUID = 1L;
}
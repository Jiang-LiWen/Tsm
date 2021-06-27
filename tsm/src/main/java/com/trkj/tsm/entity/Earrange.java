package com.trkj.tsm.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * earrange
 * @author 
 */
@Data
public class Earrange implements Serializable {
    /**
     * 预排课编号
     */
    private Integer earrangeId;

    /**
     * 时段编号
     */
    private Integer eperiodId;
    private Trainingperiod trainingperiod;
    /**
     * 班级编号
     */
    private Integer eclassesId;
    private Classes classes;
    /**
     * 教室编号
     */
    private Integer eclassroomId;
    private Classroom classroom;
    /**
     * 排课日期
     */
    private String earrangedate;

    private static final long serialVersionUID = 1L;
}
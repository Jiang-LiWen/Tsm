package com.trkj.tsm.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * dropout
 * @author 
 */
@Data
public class Dropout implements Serializable {
    /**
     * 退学编号
     */
    private Integer dropId;

    /**
     * 学员编号
     */
    private Student student;
    private Integer studentId;

    /**
     * 班级编号
     */
    private Classes classes;
    private Integer classesId;

    /**
     * 课程编号
     */
    private Course course;
    private Integer courseId;

    /**
     * 课程详细编号
     */
    private Detailcourse detailcourse;
    private Integer detailcourseId;

    /**
     * 退学理由
     */
    private String dropReason;

    /**
     * 退学办理人
     */
    private String dropHandler;

    /**
     * 退学时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dropTime;

    /**
     * 教务部审批
     */
    private Integer jwApproval;

    /**
     * 退费状态
     */
    private Integer ispay;
    /**
     * 退学状态
     */
    private Integer dropoutstatus;
    /**
     * 教务部审批人
     */
    private String jwAppname;

    /**
     * 教务部审批时间
     */
    private Date jwApptime;

    /**
     * 撤销教务部审批人
     */
    private String jwDropnameapp;

    /**
     * 撤销教务部审批时间
     */
    private Date jwDroptimeapp;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    private Date deletetime;

    /**
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
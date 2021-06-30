package com.trkj.tsm.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * shift
 * @author 
 */
@Data
public class Shift implements Serializable {
    /**
     * 编号
     */
    private Integer shiftId;

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
     * 转班时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date shiftTime;

    /**
     * 转班理由
     */
    private String shiftReason;

    /**
     * 转班办理人
     */
    private String shiftHandler;

    /**
     * 操作审批
     */
    private Integer approval;

    /**
     * 审批时间
     */
    private Date jwApptime;

    /**
     * 审批人
     */
    private String jwAppname;

    /**
     * 撤销审批人
     */
    private String jwDropnameapp;

    /**
     * 撤销审批时间
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
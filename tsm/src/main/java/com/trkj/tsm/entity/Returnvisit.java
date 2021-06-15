package com.trkj.tsm.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * returnvisit
 * @author 
 */
@Data
public class Returnvisit implements Serializable {
    /**
     * 回访编号
     */
    private Integer returnvisitId;

    /**
     * 咨询登记编号
     */
    private Register register;
    private Integer registerId;

    /**
     * 接待人
     */
    private Emp emp;
    private Integer empId;

    /**
     * 批注意见
     */
    private String comments;

    /**
     * 回访方式 :线下回访；线上回访
     */
    private String returnvisitmode;

    /**
     * 回访日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date returnvisitdate;

    /**
     * 回访反馈
     */
    private String returnvisitback;

    /**
     * 回访内容
     */
    private String returncontent;

    /**
     * 增加人
     */
    private String addname;

    /**
     * 增加时间
     */
    private Date addtime;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    private Date deletetime;

    /**
     * 时效性 0：未过期；1：已过期
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
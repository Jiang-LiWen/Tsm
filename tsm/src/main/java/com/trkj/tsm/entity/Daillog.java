package com.trkj.tsm.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * daillog
 *
 * @author
 */
@Data
public class Daillog implements Serializable {
    /**
     * 工作日志编号
     */
    private Integer daillogId;

    /**
     * 交待事项
     */
    private String handovermatters;

    /**
     * 交待人
     */
    private String handovername;

    /**
     * 日志状态 0：未完成；1：已完成
     */
    private Integer logstate;

    /**
     * 删除日志人员
     */
    private String deltename;

    /**
     * 删除日志时间
     */
    private Date deltetime;

    /**
     * 新增日志人员
     */
    private String addname;

    /**
     * 新增日志时间
     */
    private Date addtime;

    /**
     * 时效性 0：未删除；1：已删除
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
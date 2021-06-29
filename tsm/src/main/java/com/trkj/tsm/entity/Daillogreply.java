package com.trkj.tsm.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * daillogreply
 *
 * @author
 */
@Data
public class Daillogreply implements Serializable {
    /**
     * 工作日志回复编号
     */
    private Integer daillogreplyId;

    /**
     * 工作日志编号
     */
    private Integer daillogId;

    /**
     * 工作日志编号
     */
    private Daillog daillog;
    /**
     * 回复人
     */
    private String repliername;

    /**
     * 回复时间
     */
    private Date repliertime;

    /**
     * 回复内容
     */
    private String repliercontent;

    private static final long serialVersionUID = 1L;
}
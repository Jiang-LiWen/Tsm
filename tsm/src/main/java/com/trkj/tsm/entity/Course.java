package com.trkj.tsm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * course
 * @author
 */
@Validated
@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {
    /**
     * 课程表编号
     */
    private Integer courseId;
    /**
     * 课类外键实体类
     */
    private Classtype classtype;
    /**
     * 提成
     */
    private BigDecimal commission;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 课程状态 0:停报；1：开报
     */
    private Integer courseState;

    /**
     * 课时量
     */
    private Integer classhours;

    /**
     * 课程费用
     */
    private BigDecimal courseMoney;

    /**
     * 课类编号
     */
    private Integer classtypeId;

    /**
     * 增加人
     */
    private String addname;

    /**
     * 增加时间
     */
    private Date addtime;

    /**
     * 修改人
     */
    private String updatename;

    /**
     * 最后修改时间
     */
    private Date updatetime;

    /**
     * 停报办理人
     */
    private String stopname;

    /**
     * 停报办理时间
     */
    private Date stoptime;

    /**
     * 开报办理人
     */
    private String beginname;

    /**
     * 开报办理时间
     */
    private Date begintime;

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
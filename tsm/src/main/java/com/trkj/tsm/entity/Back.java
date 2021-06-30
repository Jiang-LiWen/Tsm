package com.trkj.tsm.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * back
 * @author 
 */
@Data
public class Back implements Serializable {
    /**
     * 复课编号
     */
    private Integer backId;

    /**
     * 停课编号
     */
    private Suspende suspende;
    private Integer suspendeId;

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
     * 班级已上课时
     */
    private String classalreadyon;

    /**
     * 缺课节数
     */
    private String absent;

    /**
     * 退费状态
     */
    private Integer ispay;

    /**
     * 复课意向
     */
    private String intention;

    /**
     * 复课时间
     */
    private Date backTime;

    /**
     * 复课办理人
     */
    private String suspendeHandler;

    /**
     * 复课审批
     */
    private Integer backApproval;

    /**
     * 修改人
     */
    private String updatename;

    /**
     * 最后修改时间
     */
    private Date updatetime;

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
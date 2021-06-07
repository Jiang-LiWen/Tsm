package com.trkj.tsm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * detailcourse
 * @author 
 */
@Validated
@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
public class Detailcourse implements Serializable {
    /**
     * 课程详细编号
     */
    private Integer detailcourseId;

    /**
     * 课程
     */
    private Course course;

    /**
     * 课程编号
     */
    private Integer courseId;

    /**
     * 课程详细名称
     */
    private String detailcourseName;

    /**
     * 课程序列号
     */
    private Integer serial;

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
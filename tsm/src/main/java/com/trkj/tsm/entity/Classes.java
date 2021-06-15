package com.trkj.tsm.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

/**
 * classes
 * @author 
 */
@Validated
@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
public class Classes implements Serializable {
    /**
     * 班级编号
     */
    private Integer classesId;

    /**
     * 课程编号
     */
    private Integer courseId;
    /**
     * 课程
     */
    private Course course;

    /**
     * 教员编号
     */
    private Integer teacherId;
    /**
     * 教员
     */
    private Emp tteacher;
    /**
     * 班主任编号
     */
    private Integer empId;
    /**
     * 班主任
     */
    private Emp cteacher;
    /**
     * 课程详细编号
     */
    private Integer detailcourseId;
    /**
     * 课程详细
     */
    private Detailcourse detailcourse;
    /**
     * 班级名称
     */
    private String classesName;

    /**
     * 开班状态
     */
    private Integer classesOpen;

    /**
     * 开班时间
     */
    private Date opendate;

    /**
     * 班级状态
     */
    private Integer classesState;

    /**
     * 毕业时间
     */
    private Date enddate;

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
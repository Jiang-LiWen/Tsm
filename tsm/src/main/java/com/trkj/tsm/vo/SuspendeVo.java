package com.trkj.tsm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.tsm.entity.Classes;
import com.trkj.tsm.entity.Course;
import com.trkj.tsm.entity.Detailcourse;
import com.trkj.tsm.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * suspende
 * @author 
 */
@Validated
@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
public class SuspendeVo implements Serializable {
    /**
     * 停课编号
     */
    private Integer suspendeId;

    /**
     * 学员状态编号
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
     * 已上课时
     */
    private String alreadyon;

    /**
     * 停课时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date suspendeTime;

    /**
     * 停课理由
     */
    private String suspendeReason;

    /**
     * 停课办理人
     */
    private String suspendeHandler;

    /**
     * 停课状态
     */
    private Integer suspensionstatus;

    /**
     * 停课审批人
     */
    private String suspendeSappname;

    /**
     * 停课审批时间
     */
    private Date suspendeSapptime;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    private Date deletetime;

    /**
     * 修改人
     */
    private String updatename;

    /**
     * 最后修改时间
     */
    private Date updatetime;

    /**
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
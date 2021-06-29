package com.trkj.tsm.vo;

import com.trkj.tsm.entity.Classes;
import com.trkj.tsm.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;
import java.util.Date;
@Validated
@Data
@NonNull
@NoArgsConstructor
@AllArgsConstructor


public class StudentstatusVo {
    /**
     * 学员考勤编号
     */
    private Integer studentstatusId;

    /**
     * 停课编号
     */
    private Integer suspendeId;

    /**
     * 学员编号
     */
    private Integer studentId;
    private StudentVo studentVo;
    /**
     * 班级编号
     */
    private Integer classesId;
    private ClassesVo classesVo;
    /**
     * 课程编号
     */
    private Integer courseId;

    /**
     * 报班时间
     */
    private Date signuptime;

    /**
     * 学员状态
     */
    private Integer status;

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

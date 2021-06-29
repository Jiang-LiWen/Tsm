package com.trkj.tsm.vo;

import com.trkj.tsm.entity.Classes;
import com.trkj.tsm.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * shift
 * @author 
 */
@Validated
@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
public class ShiftVo implements Serializable {
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
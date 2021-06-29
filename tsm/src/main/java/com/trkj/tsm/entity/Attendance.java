package com.trkj.tsm.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.tsm.vo.StudentVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import org.springframework.boot.convert.DurationFormat;

/**
 * attendance
 * @author 
 */
@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
public class Attendance implements Serializable {
    /**
     * 学员考勤编号
     */
    private Integer attendanceId;

    /**
     * 学员编号
     */
    private Student student;
    private Integer studentId;

    /**
     * 职工编号
     */
    private Emp emp;
    private Integer empId;

    /**
     * 考勤时间
     */
    private Date attendanceTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 备注
     */
    private String remarks;

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
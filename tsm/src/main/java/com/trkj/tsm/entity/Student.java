package com.trkj.tsm.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;
import org.springframework.validation.annotation.Validated;

/**
 * student
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student implements Serializable {
    /**
     * 学员编号
     */
    private Integer studentId;

    /**
     * 班级编号
     */
    private Integer classesId;

    /**
     * 生源渠道编号
     */
    private Integer sourceId;

    /**
     * 咨询登记编号
     */
    private Register register;
    private Integer registerId;

    /**
     * 学号
     */
    private String studentNumber;

    /**
     * 学生名称
     */
    private String studentName;

    /**
     * 就读时间
     */
    private Date studytime;

    /**
     * 入学备注
     */
    private String entrance;

    /**
     * 性别
     */
    private String sex;

    /**
     * 联系电话
     */
    private String studentPhone;

    /**
     * 居住地址
     */
    private String address;

    /**
     * 照片地址
     */
    private String imgaddress;

    /**
     * 家长姓名
     */
    private String parentname;

    /**
     * 家长电话
     */
    private String parentphone;

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
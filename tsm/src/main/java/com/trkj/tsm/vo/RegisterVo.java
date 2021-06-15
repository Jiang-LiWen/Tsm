package com.trkj.tsm.vo;

import com.trkj.tsm.entity.Course;
import com.trkj.tsm.entity.Detailcourse;
import com.trkj.tsm.entity.Emp;
import com.trkj.tsm.entity.Source;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * register
 * @author 
 */
@Validated
@Data
@NonNull
@NoArgsConstructor
@AllArgsConstructor
public class RegisterVo implements Serializable {
    /**
     * 咨询登记编号
     */
    private Integer registerId;

    /**
     * 生源渠道编号
     */
    private Source source;
    private Integer sourceId;

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
     * 接待人
     */
    private Emp emp;
    private Integer empId;

    /**
     * 咨询人联系方式
     */
    private String phone;

    /**
     * 咨询人
     */
    private String consultant;

    /**
     * 咨询人性别
     */
    private String sex;

    /**
     * 咨询内容
     */
    private String consultcontent;

    /**
     * 咨询状态 0:有意向；1：无意向；2：已就读（判断回不回访）
     */
    private Integer attentstate;

    /**
     * 新增咨询登记职工
     */
    private String addname;

    /**
     * 新增咨询登记时间
     */
    private Date addtime;

    /**
     * 时效性 0：未过期；1：已过期
     */
    private Integer timeliness;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    private Date deletetime;

    /**
     * 最后修改人员
     */
    private String lastupdatename;

    /**
     * 最后修改时间
     */
    private Date lastupdatetime;

    /**
     * 咨询状态 0：未缴费；1：待缴费；2：已缴费
     */
    private Integer paystate;

    private static final long serialVersionUID = 1L;
}
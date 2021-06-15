package com.trkj.tsm.vo;

import com.trkj.tsm.entity.Emp;
import com.trkj.tsm.entity.Register;
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
public class ReturnvisitVo {
    /**
     * 回访编号
     */
    private Integer returnvisitId;

    /**
     * 咨询登记编号
     */
    private Register register;
    private Integer registerId;

    /**
     * 接待人
     */
    private Emp emp;
    private Integer empId;

    /**
     * 批注意见
     */
    private String comments;

    /**
     * 回访方式 :线下回访；线上回访
     */
    private String returnvisitmode;

    /**
     * 回访日期
     */
    private Date returnvisitdate;

    /**
     * 回访反馈
     */
    private String returnvisitback;

    /**
     * 回访内容
     */
    private String returncontent;

    /**
     * 增加人
     */
    private String addname;

    /**
     * 增加时间
     */
    private Date addtime;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    private Date deletetime;

    /**
     * 时效性 0：未过期；1：已过期
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}

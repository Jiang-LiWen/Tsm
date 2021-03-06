package com.trkj.tsm.entity;

import com.trkj.tsm.vo.EmpVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * mail
 *
 * @author
 */
@Validated
@Data
@NonNull
@NoArgsConstructor
@AllArgsConstructor
public class Mail implements Serializable {
    /**
     * 邮件编号
     */
    private Integer mailId;

    /**
     * 邮件标题
     */
    private String mailTitle;

    /**
     * 级别 0:普通；1：重要
     */
    private Integer mailRank;

    /**
     * 邮件内容
     */
    private String mailContent;

    /**
     * 状态 0:未阅；1：已阅
     */
    private Integer mailState;

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

    /**
     * 发件人编号
     */
    private Integer empId;

    /**
     * 发件人编号
     */
    private EmpVo emp;

    /**
     * 是否草稿 0:正常邮件；1：草稿邮件
     */
    private Integer isdraft;

    /**
     * 发送时间
     */
    private Date senddate;

    /**
     * 接收时间
     */
    private Date receivedate;

    /**
     * 状态
     */
    private Integer type;

    private static final long serialVersionUID = 1L;
}
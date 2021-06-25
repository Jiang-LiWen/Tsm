package com.trkj.tsm.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.tsm.entity.Book;
import com.trkj.tsm.entity.Emp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

/**
 * bookback
 * @author
 */
@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
@NonNull
public class BookbackVo {
    /**
     * 教材破损编号
     */
    private Integer bookbackId;

    /**
     * 破损处理人员
     */
    private Emp emp;
    private Integer empId;

    /**
     * 教材编号
     */
    private Book book;
    private Integer bookId;

    /**
     * 破损处理时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date storagetime;

    /**
     *  退回金额
     */
    private BigDecimal backmoney;

    /**
     * 退回数量
     */
    private Integer backcount;

    /**
     * 销售编号 ：自动生成（xs +时间戳+0001）
     */
    private String returnnumber;

    /**
     * 破损原因描述
     */
    private String causeofdamage;

    /**
     * 审批状态 0：未审批；1：已审批（教务主任审批）
     */
    private Integer approval;

    /**
     * 审批人
     */
    private String appname;

    /**
     * 审批时间
     */
    private Date apptime;

    /**
     * 撤销审批人
     */
    private String revokeAppname;

    /**
     * 撤销审批时间
     */
    private Date revokeApptime;

    /**
     * 修改人
     */
    private String updatename;

    /**
     * 修改时间
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
     * 时效性 0：未过期；1：已过期
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
package com.trkj.tsm.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.trkj.tsm.entity.Emp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

/**
 * bookdelivery
 * @author 
 */
@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
@NonNull
public class BookdeliveryVo {
    /**
     * 教材出库总编号
     */
    private Integer bookdeliveryId;

    /**
     * 购买人姓名
     */
    private String bookdeliveryName;

    /**
     * 购买人备注
     */
    private String bookdeliveryRemarks;

    /**
     *  职工编号
     */
    private Emp emp;
    private Integer empId;

    /**
     * 销售编号 ：自动生成（xs +时间戳+0001）
     */
    private String salenumber;

    /**
     * 出库时间
     */
    private Date deliverytime;

    /**
     * 总价格
     */
    private BigDecimal tota;

    /**
     *  缴费金额
     */
    private BigDecimal paymoney;




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
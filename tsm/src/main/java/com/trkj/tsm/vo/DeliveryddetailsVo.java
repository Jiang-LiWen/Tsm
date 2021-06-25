package com.trkj.tsm.vo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.trkj.tsm.entity.Book;
import com.trkj.tsm.entity.Bookdelivery;
import com.trkj.tsm.entity.Emp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

/**
 * deliveryddetails
 * @author 
 */
@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
@NonNull
public class DeliveryddetailsVo {
    /**
     * 教材出库详情编号
     */
    private Integer deliveryddetailsId;

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
     * 教材出库总编号
     */
    private Bookdelivery bookdelivery;
    private Integer bookdeliveryId;

    /**
     * 教材编号
     */
    private Book book;
    private Integer bookId;

    /**
     * 出库数量
     */
    private Integer deliverycount;

    /**
     *  缴费金额
     */
    private BigDecimal paymoney;

    /**
     * 应收金额
     */
    private BigDecimal receivablemoney;


    /**
     * 时效性 0：未过期；1：已过期
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
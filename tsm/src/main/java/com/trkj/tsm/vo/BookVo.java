package com.trkj.tsm.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * book
 * @author 
 */
@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
@NonNull
public class BookVo implements Serializable {
    /**
     * 教材编号
     */
    private Integer bookId;

    /**
     * 教材名称
     */
    private String bookname;

    /**
     * 库存
     */
    private Integer deliverycount;

    /**
     *  教材售价
     */
    private BigDecimal booksprice;

    /**
     * 教材进价
     */
    private BigDecimal bookjprice;

    /**
     * 安全库存
     */
    private Integer safestock;

    /**
     * 出版社
     */
    private String press;

    /**
     * 教材状态 0：未删除；1：已删除
     */
    private Integer state;

    /**
     * 入库量
     */
    private Integer storagee;

    private static final long serialVersionUID = 1L;
}
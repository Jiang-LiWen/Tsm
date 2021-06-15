package com.trkj.tsm.vo;

import com.trkj.tsm.entity.Book;
import com.trkj.tsm.entity.Emp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * bookstorage
 * @author 
 */
@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
@NonNull
public class BookstorageVo{
    /**
     * 教材入库编号
     */
    private Integer mbookstorageId;

    /**
     * 入库员职工编号
     */
    private Emp emp;
    private Integer empId;

    /**
     * 入库数量
     */
    private Integer storagecount;

    /**
     * 入库时间
     */
    private Date storagetime;

    /**
     * 教材编号
     */
    private Book book;
    private Integer bookId;

    /**
     * 总价格
     */
    private BigDecimal totalprice;

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
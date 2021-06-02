package com.trkj.tsm.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * unittype
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Unittype implements Serializable {
    /**
     * 编号
     */
    private Integer unittypeId;

    /**
     * 单位类型名称
     */
    private String unittypeName;

    /**
     * 增加人
     */
    private String addname;

    /**
     * 增加时间
     */
    private Date addtime;

    /**
     * 最后修改人
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
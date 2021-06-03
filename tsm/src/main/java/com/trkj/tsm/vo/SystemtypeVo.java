package com.trkj.tsm.vo;

import lombok.Data;

import java.util.Date;

/**
 * systemtype
 * @author 
 */
@Data
public class SystemtypeVo  {
    /**
     * 制度类型编号
     */
    private Integer systemtypeId;

    /**
     * 制度类型名称
     */
    private String systemtypeName;

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
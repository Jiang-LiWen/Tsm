package com.trkj.tsm.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * source
 * @author 
 */
@Data
public class Source implements Serializable {
    /**
     * 生源渠道编号
     */
    private Integer sourceId;

    /**
     * 生源渠道
     */
    private String sourceName;

    /**
     * 已有生源
     */
    private Integer already;

    /**
     * 潜在生源
     */
    private Integer potential;

    /**
     * 新增渠道职工
     */
    private String addchannelname;

    /**
     * 新增渠道时间
     */
    private Date addchanneltime;

    /**
     * 最后修改人员
     */
    private String lastupdatename;

    /**
     * 最后修改时间
     */
    private Date lastupdatetime;

    /**
     * 删除渠道人员
     */
    private String delchannelname;

    /**
     * 删除渠道时间
     */
    private Date delchanneltime;

    /**
     * 时效性 0：未过期；1：已过期
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
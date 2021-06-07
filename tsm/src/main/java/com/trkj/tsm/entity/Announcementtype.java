package com.trkj.tsm.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * announcementtype
 * @author 
 */
@Data
public class Announcementtype implements Serializable {
    /**
     * 编号
     */
    private Integer announcementtypeId;

    /**
     * 公告类型名称
     */
    private String announcementtypeName;

    /**
     * 增加人
     */
    private String addname;

    /**
     * 增加时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date addtime;

    /**
     * 最后修改人
     */
    private String updatename;

    /**
     * 最后修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deletetime;

    /**
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
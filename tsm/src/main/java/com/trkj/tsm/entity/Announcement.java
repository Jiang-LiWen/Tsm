package com.trkj.tsm.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * announcement
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Announcement implements Serializable {
    /**
     * 编号
     */
    private Integer announcementId;
    /**
     * 公告类型实体类
     */
    private Announcementtype announcementtype;
    /**
     * 公告类型
     */
    private Integer announcementtypeId;

    /**
     * 开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    /**
     * 结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    /**
     * 公告主题
     */
    private String announcementTheme;

    /**
     * 公告内容
     */
    private String announcementContent;

    /**
     * 公告状态
     */
    private Integer announcementState;

    /**
     * 录入人员
     */
    private String addname;

    /**
     * 录入时间
     */
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date addtime;

    /**
     * 最后发布人
     */
    private String publishnmae;

    /**
     * 最后发布时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publishtime;

    /**
     * 最后暂停人
     */
    private String suspendname;

    /**
     * 最后暂停时间
     */
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date suspendtime;

    /**
     * 最后修改人
     */
    private String updatename;

    /**
     * 最后修改时间
     */
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deletetime;

    /**
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
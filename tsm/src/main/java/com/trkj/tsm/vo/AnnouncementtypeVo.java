package com.trkj.tsm.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

/**
 * announcementtype
 * @author
 */
@Validated
@Data
@NonNull
@NoArgsConstructor
@AllArgsConstructor
public class AnnouncementtypeVo implements Serializable {
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
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date addtime;

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
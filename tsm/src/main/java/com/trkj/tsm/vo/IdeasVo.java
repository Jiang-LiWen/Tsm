package com.trkj.tsm.vo;

import com.trkj.tsm.entity.Suggest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Validated
@Data
@NonNull
@NoArgsConstructor
@AllArgsConstructor
public class IdeasVo {
    /**
     * 意见编号
     */
    private Integer ideasId;

    /**
     * 意见标题
     */
    private String ideasTitle;

    /**
     * 意见内容
     */
    private String ideasName;

    /**
     * 意见状态 0:已回复; 1:默认值为待回复
     */
    private String state;

    /**
     * 管理人
     */
    private String keeper;

    /**
     * 回复人
     */
    private String reply;

    /**
     * 回复时间
     */
    private Date revoverytime;

    /**
     * 回复内容
     */
    private String revoveryname;

    /**
     * 发表时间
     */
    private Date timeofpublication;

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

    /**
     * 意见箱编号
     */
    private Integer suggestId;
    /**
     * 意见箱编号
     */
    private Suggest suggest;
    /**
     * 类型
     */
    private Integer type;

    private static final long serialVersionUID = 1L;

}

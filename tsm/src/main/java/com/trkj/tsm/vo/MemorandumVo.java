package com.trkj.tsm.vo;

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
public class MemorandumVo {
    /**
     * 备忘录编号
     */
    private Integer memorandumId;

    /**
     * 备忘录标题
     */
    private String memorandumTitle;

    /**
     * 备忘录内容
     */
    private String memorandumName;

    /**
     * 备忘录类型
     */
    private String memorandumType;

    /**
     * 开始时间
     */
    private Date starttime;

    /**
     * 结束时间
     */
    private Date endtime;

    /**
     * 删除时间
     */
    private Date deletetime;

    /**
     * 回复内容
     */
    private String repliercontent;

    /**
     * 时效性 0：未过期；1：已过期
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}

package com.trkj.tsm.vo;

import com.trkj.tsm.entity.Daillog;
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
public class DailLogReplyVo {
    /**
     * 工作日志回复编号
     */
    private Integer daillogreplyId;

    /**
     * 工作日志编号
     */
    private Integer daillogId;

    /**
     * 工作日志编号
     */
    private Daillog daillog;
    /**
     * 回复人
     */
    private String repliername;

    /**
     * 回复时间
     */
    private Date repliertime;

    /**
     * 回复内容
     */
    private String repliercontent;

    private static final long serialVersionUID = 1L;
}

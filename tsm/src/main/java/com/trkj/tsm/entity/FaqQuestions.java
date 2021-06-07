package com.trkj.tsmvueboot.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * faq_questions
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FaqQuestions implements Serializable {
    /**
     * 编号
     */
    private Integer faqId;

    /**
     * 问题
     */
    private String problem;

    /**
     * 回答
     */
    private String answer;

    /**
     * 增加人
     */
    private String addname;

    /**
     * 增加时间
     */
    private Date addtime;

    /**
     * 修改人
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
     * 点击量
     */
    private Integer clickcount;

    /**
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
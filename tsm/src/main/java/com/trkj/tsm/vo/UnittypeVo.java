package com.trkj.tsm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

@Validated
@Data
@NonNull
@NoArgsConstructor
@AllArgsConstructor
public class UnittypeVo implements Serializable {
    /**
     * 编号
     */
    private Integer unittypeId;

    /**
     * 单位类型名称  唯一
     */
    private String unittypeName;

    /**\
     * 增加人
     */
    private String addname;
    /**
     * 增加时间 自增
     *
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

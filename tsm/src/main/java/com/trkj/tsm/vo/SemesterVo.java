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
public class SemesterVo {
    /**
     * 编号
     */
    private Integer semesterId;

    /**
     * 学期名称
     */
    private String semesterName;

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
     * 时效性:0：未过期；1：已过期
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}

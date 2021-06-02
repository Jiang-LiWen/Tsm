package com.trkj.tsm.vo;

import com.trkj.tsm.entity.Unittype;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Data
@NonNull
@Validated
@AllArgsConstructor
@NoArgsConstructor
public class UnitVo {
    /**
     * 编号
     */
    private Integer unitId;

    /**
     * 单位名称
     */
    private String unitName;

    /**
     * 单位类型编号
     */
    private Integer unittypeId;

    /**
     * 单位类型实体类
     */
    private Unittype Unittype;

    /**
     * 单位级别
     */
    private String unitLevel;

    /**
     * 负责人
     */
    private String director;

    /**
     * 单位地址
     */
    private String unitAddress;

    /**
     * 邮政编码
     */
    private String mailcode;

    /**
     * 单位电话
     */
    private String unitPhone;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 简介
     */
    private String profile;

    /**
     * 备注
     */
    private String remarks;

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
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}

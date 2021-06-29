package com.trkj.tsm.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;

@Data
@Validated
@AllArgsConstructor
@NoArgsConstructor
@NonNull
public class PositionVo {
    /**
     * 职位编号
     */
    private Integer positionId;

    /**
     * 职位名称
     */
    private String positionName;

    /**
     * 角色描述
     */
    private String roleDesc;

    /**
     * 角色的英文code.如：ADMIN
     */
    private String roleCode;

    /**
     * 0表示可用
     */
    private Integer status;

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
     * 时效性 0：未过期；1：已过期
     */
    private Integer timeliness;

    private List<MenuVo> menus;

    private static final long serialVersionUID = 1L;
}

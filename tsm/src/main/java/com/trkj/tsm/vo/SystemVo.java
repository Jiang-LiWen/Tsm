package com.trkj.tsm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * system1
 * @author 
 */
@Data
public class SystemVo {
    /**
     * 制度编号
     */
    private Integer systemId;

    /**
     * 制度类型表
     */
    private SystemtypeVo systemtypeVo;
    private Integer systemtypeId;

    /**
     * 制度主题
     */
    private String systemTheme;

    /**
     * 发文单位
     */
    private DeptVo deptVo;
    private Integer deptId;

    /**
     * 制度内容
     */
    private String systemContent;

    /**
     * 制度状态 0：待发布；1：已发布；2：已暂停
     */
    private Integer systemState;

    /**
     * 录入人员
     */
    private String addname;

    /**
     * 录入时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date addtime;

    /**
     * 最后发布人
     */
    private String publishnmae;

    /**
     * 最后发布时间
     */
    private Date publishtime;

    /**
     * 最后暂停人
     */
    private String suspendname;

    /**
     * 最后暂停时间
     */
    private Date suspendtime;

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
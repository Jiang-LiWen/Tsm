package com.trkj.tsm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * classtype
 * @author 
 */
@Validated
@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
public class Classtype implements Serializable {
    /**
     * 编号
     */
    private Integer classtypeId;

    /**
     * 课类名称
     */
    private String classtypeName;

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
     * 修改时间
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
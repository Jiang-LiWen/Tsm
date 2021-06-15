package com.trkj.tsm.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * classroom
 * @author 
 */
@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
public class Classroom implements Serializable {
    /**
     * 教室编号
     */
    private Integer classroomId;

    /**
     * 教室名称
     */
    private String classroomName;

    /**
     * 容纳量
     */
    private Integer catacity;

    /**
     * 教室地点
     */
    private String place;

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
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
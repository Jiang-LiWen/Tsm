package com.trkj.tsm.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * opjournal
 * @author 
 */
@Data
public class Opjournal implements Serializable {
    /**
     * 日志编号
     */
    private Integer opjournalId;


    private String EmpName;
    /**
     * 操作内容
     */
    private String opcontent;

    /**
     * 操作时间
     */
    private Date optime;

    private static final long serialVersionUID = 1L;
}
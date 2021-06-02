package com.trkj.tsm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.tsm.entity.Dept;
import com.trkj.tsm.entity.Enterprise;
import com.trkj.tsm.entity.Position;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Data
@AllArgsConstructor
@NonNull
@NoArgsConstructor
@Validated
public class EmpVo {
    /**
     * 职工编号
     */
    private Integer empId;

    /**
     * 部门编号
     */
    private Integer deptId;

    /**
     * 部门实体类
     */
    private Dept dept;

    /**
     * 职位编号
     */
    private Integer positionId;

    /**
     * 职位实体类
     */
    private Position position;

    /**
     * 企业档案编号
     */
    private Integer enterpriseId;

    /**
     * 企业档案实体类
     */
    private Enterprise enterprise;

    /**
     * 用户头像
     */
    private String userimg;

    /**
     * 个人信息头像
     */
    private String individualimg;

    /**
     * 工号 ：自动生成（部门序列号+此部门人数+1）
     */
    private String jobnumber;

    /**
     * 职工名称
     */
    private String empName;

    /**
     * 职工性别
     */
    private String empSex;

    /**
     * 职工电话
     */
    private String empPhone;

    /**
     * 电子邮件
     */
    private String eMail;

    /**
     * 生日
     */

    private Date birthday;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 居住地址
     */
    private String address;

    /**
     * 职员状态
     */
    private Integer empstate;

    /**
     * 登入密码
     */
    private String passwords;

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
     * 限制登录状态
     */
    private Integer loginstate;

    /**
     * 教育水平 :小学；初中；高中；大专；本科；硕士
     */
    private String education;

    /**
     * 毕业学校
     */
    private String graduate;

    private static final long serialVersionUID = 1L;
}

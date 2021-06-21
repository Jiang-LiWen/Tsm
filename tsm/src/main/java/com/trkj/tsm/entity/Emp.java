package com.trkj.tsm.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * emp
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp implements UserDetails {
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

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 0无效用户，1是有效用户
     */
    private Boolean enabled;

    /**
     * 账户是否没过期
     */
    private Boolean accountNonExpired;

    /**
     * 是否没被锁定
     */
    private Boolean accountNonLocked;

    /**
     * 密码是否没有过期
     */
    private Boolean credentialsNonExpired;

    private static final long serialVersionUID = 1L;

    Collection<? extends GrantedAuthority> authorities;  //用户的权限集合

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
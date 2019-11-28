package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PcUacUser implements Serializable {
    /**
    * ID
    */
    private Long id;

    /**
    * 版本号
    */
    private Integer version;

    /**
    * 登录名
    */
    private String loginName;

    /**
    * 登录密码
    */
    private String loginPwd;

    /**
    * 盐,用于shiro加密, 字段停用
    */
    private String salt;

    /**
    * 工号
    */
    private String userCode;

    /**
    * 姓名
    */
    private String userName;

    /**
    * 手机号
    */
    private String mobileNo;

    /**
    * 邮件地址
    */
    private String email;

    /**
    * 状态
    */
    private String status;

    /**
    * 用户来源
    */
    private String userSource;

    /**
    * 操作员类型（2000伙伴，3000客户，1000运营）
    */
    private String type;

    /**
    * 最后登录IP地址
    */
    private String lastLoginIp;

    /**
    * 最后登录位置
    */
    private String lastLoginLocation;

    /**
    * 描述
    */
    private String remark;

    /**
    * 最后登录时间
    */
    private Date lastLoginTime;

    /**
    * 是否更改过密码
    */
    private Short isChangedPwd;

    /**
    * 连续输错密码次数（连续5次输错就冻结帐号）
    */
    private Short pwdErrorCount;

    /**
    * 最后输错密码时间
    */
    private Date pwdErrorTime;

    /**
    * 创建人
    */
    private String creator;

    /**
    * 创建人ID
    */
    private Long creatorId;

    /**
    * 创建时间
    */
    private Date createdTime;

    /**
    * 最近操作人
    */
    private String lastOperator;

    /**
    * 最后操作人ID
    */
    private Long lastOperatorId;

    /**
    * 更新时间
    */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
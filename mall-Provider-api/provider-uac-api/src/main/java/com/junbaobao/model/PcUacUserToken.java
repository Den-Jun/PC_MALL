package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PcUacUserToken implements Serializable {
    /**
    * ID
    */
    private Long id;

    /**
    * 版本号
    */
    private Integer version;

    /**
    * 父ID
    */
    private Long pid;

    /**
    * 登录名
    */
    private String loginName;

    /**
    * 姓名
    */
    private String userName;

    /**
    * 用户ID
    */
    private Long userId;

    /**
    * 操作系统
    */
    private String os;

    /**
    * 浏览器
    */
    private String browser;

    /**
    * 登陆人Ip地址
    */
    private String loginIp;

    /**
    * 登录地址
    */
    private String loginLocation;

    /**
    * 登录时间
    */
    private Date loginTime;

    /**
    * 访问token
    */
    private String accessToken;

    /**
    * 刷新token
    */
    private String refreshToken;

    /**
    * token类型
    */
    private String tokenType;

    /**
    * 访问token的生效时间(秒)
    */
    private Integer accessTokenValidity;

    /**
    * 刷新token的生效时间(秒)
    */
    private Integer refreshTokenValidity;

    /**
    * 0 在线 10已刷新 20 离线
    */
    private Integer status;

    /**
    * 组织ID
    */
    private Long groupId;

    /**
    * 组织名称
    */
    private String groupName;

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
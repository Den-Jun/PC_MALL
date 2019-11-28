package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PcUacMenu implements Serializable {
    /**
    * ID
    */
    private Long id;

    /**
    * 版本号
    */
    private Integer version;

    /**
    * 菜单编码
    */
    private String menuCode;

    /**
    * 菜单名称
    */
    private String menuName;

    /**
    * 状态
    */
    private String status;

    /**
    * 菜单URL
    */
    private String url;

    /**
    * 图标
    */
    private String icon;

    /**
    * 父ID
    */
    private Long pid;

    /**
    * 层级(最多三级1,2,3)
    */
    private Integer level;

    /**
    * 是否叶子节点,1不是0是
    */
    private Integer leaf;

    /**
    * 序号
    */
    private Integer number;

    /**
    * 备注
    */
    private String remark;

    /**
    * 系统编码
    */
    private Long applicationId;

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
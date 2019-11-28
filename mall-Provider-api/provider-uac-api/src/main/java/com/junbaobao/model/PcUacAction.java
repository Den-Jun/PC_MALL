package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PcUacAction implements Serializable {
    /**
    * ID
    */
    private Long id;

    /**
    * 版本号
    */
    private Integer version;

    /**
    * 资源路径
    */
    private String url;

    /**
    * 权限名称
    */
    private String actionName;

    /**
    * 权限
    */
    private String actionCode;

    /**
    * 状态
    */
    private String status;

    /**
    * 备注
    */
    private String remark;

    /**
    * 菜单ID
    */
    private Long menuId;

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
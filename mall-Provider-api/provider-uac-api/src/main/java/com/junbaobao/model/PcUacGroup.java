package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PcUacGroup implements Serializable {
    /**
    * ID
    */
    private Long id;

    /**
    * VERSION
    */
    private Integer version;

    /**
    * 组织编码
    */
    private String groupCode;

    /**
    * 组织名称
    */
    private String groupName;

    /**
    * 状态
    */
    private Byte status;

    /**
    * 组织类型 1：仓库 2：基地
    */
    private String type;

    /**
    * 父ID
    */
    private Long pid;

    /**
    * 层级
    */
    private Integer level;

    /**
    * 是否叶子节点,1不是0是
    */
    private Integer leaf;

    /**
    * 联系人
    */
    private String contact;

    /**
    * 组织地址
    */
    private String groupAddress;

    /**
    * 省名称
    */
    private String provinceName;

    /**
    * 省编码
    */
    private Long provinceId;

    /**
    * 城市名称
    */
    private String cityName;

    /**
    * 城市编码
    */
    private Long cityId;

    /**
    * 区名称
    */
    private String areaName;

    /**
    * 区编码
    */
    private Long areaId;

    /**
    * 街道名称
    */
    private String streetName;

    /**
    * 街道编码
    */
    private Long streetId;

    /**
    * 详细地址
    */
    private String detailAddress;

    /**
    * 联系人手机号
    */
    private String contactPhone;

    /**
    * 描述
    */
    private String remark;

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

    /**
    * 预留排序字段
    */
    private Integer number;

    private static final long serialVersionUID = 1L;
}
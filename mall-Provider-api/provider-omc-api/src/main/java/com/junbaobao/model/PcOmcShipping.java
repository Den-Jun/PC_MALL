package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PcOmcShipping implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 收货姓名
     */
    private String receiverName;

    /**
     * 收货固定电话
     */
    private String receiverPhoneNo;

    /**
     * 收货移动电话
     */
    private String receiverMobileNo;

    /**
     * 收货人省ID
     */
    private Long provinceId;

    /**
     * 省份
     */
    private String provinceName;

    /**
     * 收货人城市ID
     */
    private Long cityId;

    /**
     * 收货人城市名称
     */
    private String cityName;

    /**
     * 区/县
     */
    private String districtName;

    /**
     * 区/县 编码
     */
    private String districtId;

    /**
     * 街道ID
     */
    private String streetId;

    /**
     * 接到名称
     */
    private String streetName;

    /**
     * 详细地址
     */
    private String detailAddress;

    /**
     * 邮编
     */
    private String receiverZipCode;

    /**
     * 默认地址
     */
    private Integer defaultAddress;

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
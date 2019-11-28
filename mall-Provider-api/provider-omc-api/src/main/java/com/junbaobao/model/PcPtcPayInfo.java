package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PcPtcPayInfo implements Serializable {
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
     * 订单号
     */
    private String orderNo;

    /**
     * 支付平台:1-支付宝,2-微信
     */
    private Integer payPlatform;

    /**
     * 支付宝支付流水号
     */
    private String platformNumber;

    /**
     * 支付宝支付状态
     */
    private String platformStatus;

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
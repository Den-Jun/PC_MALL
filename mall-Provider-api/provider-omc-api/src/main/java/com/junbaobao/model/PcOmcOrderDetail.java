package com.junbaobao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class PcOmcOrderDetail implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 订单明细序列号
     */
    private String detailNo;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品图片地址
     */
    private String productImage;

    /**
     * 生成订单时的商品单价，单位是元,保留两位小数
     */
    private BigDecimal currentUnitPrice;

    /**
     * 商品数量
     */
    private Integer quantity;

    /**
     * 商品总价,单位是元,保留两位小数
     */
    private BigDecimal totalPrice;

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
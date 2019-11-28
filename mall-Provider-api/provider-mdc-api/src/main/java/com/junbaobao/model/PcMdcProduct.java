package com.junbaobao.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PcMdcProduct {
    /**
     * ID
     */
    private Long id;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 商品列号
     */
    private String productCode;

    /**
     * 分类id
     */
    private Long categoryId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品副标题
     */
    private String subtitle;

    /**
     * 产品主图,url相对地址
     */
    private String mainImage;

    /**
     * 图片地址,json格式,扩展用
     */
    private String subImages;

    /**
     * 商品详情
     */
    private String detail;

    /**
     * 价格,单位-元保留两位小数
     */
    private BigDecimal price;

    /**
     * 库存数量
     */
    private Integer stock;

    /**
     * 商品状态.1-在售 2-下架 3-删除
     */
    private Integer status;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建人ID
     */
    private String creatorId;

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
    private String lastOperatorId;

    /**
     * 更新时间
     */
    private Date updateTime;
}
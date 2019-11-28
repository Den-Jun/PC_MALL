package com.junbaobao.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PcMdcAddress {
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
     * 城市编码
     */
    private String cityCode;

    /**
     * 区域编码
     */
    private String adCode;

    /**
     * 地址名称
     */
    private String name;

    /**
     * 级别（省市区县）
     */
    private Boolean level;

    /**
     * 行政区边界坐标点
     */
    private String polyline;

    /**
     * 城市中心点
     */
    private String center;

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
}
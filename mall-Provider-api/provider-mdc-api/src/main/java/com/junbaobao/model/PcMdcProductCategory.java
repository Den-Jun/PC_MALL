package com.junbaobao.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PcMdcProductCategory {
    /**
     * ID
     */
    private Long id;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 类别序列号
     */
    private String categoryCode;

    /**
     * 首图的流水号
     */
    private Long imgId;

    /**
     * 父类别id当id=0时说明是根节点,一级类别
     */
    private Long pid;

    /**
     * 类别名称
     */
    private String name;

    /**
     * 类别状态1-正常,2-已废弃
     */
    private Boolean status;

    /**
     * 排序编号,同类展示顺序,数值相等则自然排序
     */
    private Integer sortOrder;

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
package com.junbaobao.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PcMdcDict {
    private Long id;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 字典类型 -0 目录 - 1 文件
     */
    private Integer type;

    /**
     * 枚举编码
     */
    private String dictKey;

    /**
     * 枚举扩展字段
     */
    private String extendKey;

    /**
     * 枚举值
     */
    private String dictValue;

    /**
     * 字典编码
     */
    private String dictCode;

    /**
     * 字典名称
     */
    private String dictName;

    /**
     * 父ID
     */
    private Long pid;

    /**
     * 序号
     */
    private Integer number;

    /**
     * 状态 -10 可用 - 20 禁用
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

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
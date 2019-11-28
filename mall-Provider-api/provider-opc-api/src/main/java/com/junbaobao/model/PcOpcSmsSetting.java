package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PcOpcSmsSetting implements Serializable {
    /**
    * ID
    */
    private Long id;

    /**
    * 版本号
    */
    private Integer version;

    /**
    * 可再次发送时间（毫秒）
    */
    private Integer againSendTime;

    /**
    * 失效时间（分钟）
    */
    private Integer invalidTime;

    /**
    * 短信类型
    */
    private String type;

    /**
    * 类型描述
    */
    private String typeDesc;

    /**
    * 模板code
    */
    private String templetCode;

    /**
    * 模板内容
    */
    private String templetContent;

    /**
    * 一天中可发送的最大数量
    */
    private Integer sendMaxNum;

    /**
    * 一个IP一天中可发送的最大数量
    */
    private Integer ipSendMaxNum;

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
    * 删除标识(1-已删除；0-未删除)
    */
    private Integer yn;

    private static final long serialVersionUID = 1L;
}
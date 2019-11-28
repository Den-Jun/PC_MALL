package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PcTpcMqTag implements Serializable {
    /**
    * ID
    */
    private Long id;

    /**
    * 版本号
    */
    private Integer version;

    /**
    * 主题ID
    */
    private Long topicId;

    /**
    * 城市编码
    */
    private String tagCode;

    /**
    * 区域编码
    */
    private String tagName;

    /**
    * 状态, 10生效,20,失效
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
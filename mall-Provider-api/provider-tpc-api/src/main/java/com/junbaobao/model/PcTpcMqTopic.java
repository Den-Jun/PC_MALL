package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PcTpcMqTopic implements Serializable {
    /**
    * ID
    */
    private Long id;

    /**
    * 版本号
    */
    private Integer version;

    /**
    * 生产者ID
    */
    private Long producerId;

    /**
    * 城市编码
    */
    private String topicCode;

    /**
    * 区域编码
    */
    private String topicName;

    /**
    * MQ类型, 10 rocketmq 20 kafka
    */
    private Integer mqType;

    /**
    * 消息类型, 10 无序消息, 20 无序消息
    */
    private Integer msgType;

    /**
    * 状态, 10生效,20,失效
    */
    private Integer status;

    /**
    * 备注
    */
    private String remarks;

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
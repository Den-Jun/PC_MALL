package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PcTpcMqConfirm implements Serializable {
    /**
    * ID
    */
    private Long id;

    /**
    * 版本号
    */
    private Integer version;

    /**
    * 任务ID
    */
    private Long messageId;

    /**
    * 消息唯一标识
    */
    private String messageKey;

    /**
    * 消费者组编码
    */
    private String consumerCode;

    /**
    * 消费的数次
    */
    private Integer consumeCount;

    /**
    * 状态, 10 - 未确认 ; 20 - 已确认; 30 已消费
    */
    private Integer status;

    /**
    * 创建时间
    */
    private Date createdTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
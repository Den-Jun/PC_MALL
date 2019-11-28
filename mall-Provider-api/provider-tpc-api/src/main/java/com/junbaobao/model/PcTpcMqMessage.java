package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PcTpcMqMessage implements Serializable {
    /**
    * ID
    */
    private Long id;

    /**
    * 版本号
    */
    private Integer version;

    /**
    * 消息key
    */
    private String messageKey;

    /**
    * topic
    */
    private String messageTopic;

    /**
    * tag
    */
    private String messageTag;

    /**
    * 消息内容
    */
    private String messageBody;

    /**
    * 消息类型: 10 - 有序消息 ; 20 - 无序消息
    */
    private Integer messageType;

    /**
    * 生产者PID
    */
    private String producerGroup;

    /**
    * 延时级别 1s 5s 10s 30s 1m 2m 3m 4m 5m 6m 7m 8m 9m 10m 20m 30m 1h 2h
    */
    private Integer delayLevel;

    /**
    * 顺序类型 0有序 1无序
    */
    private Integer orderType;

    /**
    * 消息状态
    */
    private Integer messageStatus;

    /**
    * 状态
    */
    private Integer taskStatus;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 重发次数
    */
    private Integer resendTimes;

    /**
    * 是否死亡 0 - 活着; 1-死亡
    */
    private Integer dead;

    /**
    * 执行时间
    */
    private Integer nextExeTime;

    /**
    * 是否删除 -0 未删除 -1 已删除
    */
    private Integer yn;

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

    private static final long serialVersionUID = 1L;
}
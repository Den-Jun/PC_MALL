package com.junbaobao.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PcMqMessageData {
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
     * 消息类型: 10 - 生产者 ; 20 - 消费者
     */
    private Integer messageType;

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
    private Integer status;

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
     * 是否删除 -0 未删除 -1 已删除
     */
    private Integer yn;
}
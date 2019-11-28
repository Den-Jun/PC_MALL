package com.junbaobao.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class PcTpcMqSubscribe implements Serializable {
    /**
    * ID
    */
    private Long id;

    /**
    * 消费者ID
    */
    private Long consumerId;

    /**
    * 消费者组
    */
    private String consumerCode;

    /**
    * TOPIC_ID
    */
    private Long topicId;

    /**
    * 主题编码
    */
    private String topicCode;

    private static final long serialVersionUID = 1L;
}
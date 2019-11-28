package com.junbaobao.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class PcTpcMqPublish implements Serializable {
    /**
    * 生产者ID
    */
    private Long producerId;

    /**
    * TOPIC_ID
    */
    private Long topicId;

    private static final long serialVersionUID = 1L;
}
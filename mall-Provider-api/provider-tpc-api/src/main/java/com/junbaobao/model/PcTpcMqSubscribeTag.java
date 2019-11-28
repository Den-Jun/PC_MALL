package com.junbaobao.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class PcTpcMqSubscribeTag implements Serializable {
    /**
    * 消费者ID
    */
    private Long subscribeId;

    /**
    * TAG_ID
    */
    private Long tagId;

    private static final long serialVersionUID = 1L;
}
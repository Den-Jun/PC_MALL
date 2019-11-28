package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class JobStatusTraceLog implements Serializable {
    private String id;

    private String jobName;

    private String originalTaskId;

    private String taskId;

    private String slaveId;

    private String source;

    private String executionType;

    private String shardingItem;

    private String state;

    private String message;

    private Date creationTime;

    private static final long serialVersionUID = 1L;
}
package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class JobExecutionLog implements Serializable {
    private String id;

    private String jobName;

    private String taskId;

    private String hostname;

    private String ip;

    private Integer shardingItem;

    private String executionSource;

    private String failureCause;

    private Integer isSuccess;

    private Date startTime;

    private Date completeTime;

    private static final long serialVersionUID = 1L;
}
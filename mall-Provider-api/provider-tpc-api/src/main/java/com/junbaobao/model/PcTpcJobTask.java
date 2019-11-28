package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PcTpcJobTask implements Serializable {
    /**
    * 主键
    */
    private Long id;

    private Integer version;

    /**
    * 关联业务单号
    */
    private String refNo;

    /**
    * 业务类型
    */
    private String taskType;

    /**
    * 任务数据
    */
    private String taskData;

    /**
    * 执行次数
    */
    private Integer taskExeCount;

    /**
    * 是否死亡 0 - 活着; 1-死亡
    */
    private Integer dead;

    /**
    * 状态
    */
    private Integer status;

    /**
    * 执行实例IP
    */
    private String exeInstanceIp;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 执行时间
    */
    private Integer exeTime;

    /**
    * 删除标识
    */
    private Integer yn;

    private static final long serialVersionUID = 1L;
}
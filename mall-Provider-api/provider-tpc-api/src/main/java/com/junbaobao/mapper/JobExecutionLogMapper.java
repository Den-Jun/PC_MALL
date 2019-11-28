package com.junbaobao.mapper;

import com.junbaobao.model.JobExecutionLog;

public interface JobExecutionLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(JobExecutionLog record);

    int insertSelective(JobExecutionLog record);

    JobExecutionLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(JobExecutionLog record);

    int updateByPrimaryKey(JobExecutionLog record);
}
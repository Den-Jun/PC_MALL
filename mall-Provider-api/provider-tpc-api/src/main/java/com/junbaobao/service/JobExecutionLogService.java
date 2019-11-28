package com.junbaobao.service;

import com.junbaobao.model.JobExecutionLog;
public interface JobExecutionLogService{


    int deleteByPrimaryKey(String id);

    int insert(JobExecutionLog record);

    int insertSelective(JobExecutionLog record);

    JobExecutionLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(JobExecutionLog record);

    int updateByPrimaryKey(JobExecutionLog record);

}

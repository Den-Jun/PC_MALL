package com.junbaobao.mapper;

import com.junbaobao.model.JobStatusTraceLog;

public interface JobStatusTraceLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(JobStatusTraceLog record);

    int insertSelective(JobStatusTraceLog record);

    JobStatusTraceLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(JobStatusTraceLog record);

    int updateByPrimaryKey(JobStatusTraceLog record);
}
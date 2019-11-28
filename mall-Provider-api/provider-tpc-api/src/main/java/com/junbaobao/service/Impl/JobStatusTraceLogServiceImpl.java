package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.JobStatusTraceLogMapper;
import com.junbaobao.model.JobStatusTraceLog;
import com.junbaobao.service.JobStatusTraceLogService;
@Service
public class JobStatusTraceLogServiceImpl implements JobStatusTraceLogService{

    @Resource
    private JobStatusTraceLogMapper jobStatusTraceLogMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return jobStatusTraceLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(JobStatusTraceLog record) {
        return jobStatusTraceLogMapper.insert(record);
    }

    @Override
    public int insertSelective(JobStatusTraceLog record) {
        return jobStatusTraceLogMapper.insertSelective(record);
    }

    @Override
    public JobStatusTraceLog selectByPrimaryKey(String id) {
        return jobStatusTraceLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(JobStatusTraceLog record) {
        return jobStatusTraceLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(JobStatusTraceLog record) {
        return jobStatusTraceLogMapper.updateByPrimaryKey(record);
    }

}

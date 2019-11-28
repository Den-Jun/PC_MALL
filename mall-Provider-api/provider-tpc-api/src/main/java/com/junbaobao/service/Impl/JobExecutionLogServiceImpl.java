package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.JobExecutionLog;
import com.junbaobao.mapper.JobExecutionLogMapper;
import com.junbaobao.service.JobExecutionLogService;
@Service
public class JobExecutionLogServiceImpl implements JobExecutionLogService{

    @Resource
    private JobExecutionLogMapper jobExecutionLogMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return jobExecutionLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(JobExecutionLog record) {
        return jobExecutionLogMapper.insert(record);
    }

    @Override
    public int insertSelective(JobExecutionLog record) {
        return jobExecutionLogMapper.insertSelective(record);
    }

    @Override
    public JobExecutionLog selectByPrimaryKey(String id) {
        return jobExecutionLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(JobExecutionLog record) {
        return jobExecutionLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(JobExecutionLog record) {
        return jobExecutionLogMapper.updateByPrimaryKey(record);
    }

}

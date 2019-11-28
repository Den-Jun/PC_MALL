package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcTpcMqResendLogMapper;
import com.junbaobao.model.PcTpcMqResendLog;
import com.junbaobao.service.PcTpcMqResendLogService;
@Service
public class PcTpcMqResendLogServiceImpl implements PcTpcMqResendLogService{

    @Resource
    private PcTpcMqResendLogMapper pcTpcMqResendLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcTpcMqResendLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcTpcMqResendLog record) {
        return pcTpcMqResendLogMapper.insert(record);
    }

    @Override
    public int insertSelective(PcTpcMqResendLog record) {
        return pcTpcMqResendLogMapper.insertSelective(record);
    }

    @Override
    public PcTpcMqResendLog selectByPrimaryKey(Long id) {
        return pcTpcMqResendLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcTpcMqResendLog record) {
        return pcTpcMqResendLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcTpcMqResendLog record) {
        return pcTpcMqResendLogMapper.updateByPrimaryKey(record);
    }

}

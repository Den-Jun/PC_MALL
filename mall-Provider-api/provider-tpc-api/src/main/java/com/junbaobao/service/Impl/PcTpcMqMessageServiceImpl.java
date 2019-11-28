package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PcTpcMqMessage;
import com.junbaobao.mapper.PcTpcMqMessageMapper;
import com.junbaobao.service.PcTpcMqMessageService;
@Service
public class PcTpcMqMessageServiceImpl implements PcTpcMqMessageService{

    @Resource
    private PcTpcMqMessageMapper pcTpcMqMessageMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcTpcMqMessageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcTpcMqMessage record) {
        return pcTpcMqMessageMapper.insert(record);
    }

    @Override
    public int insertSelective(PcTpcMqMessage record) {
        return pcTpcMqMessageMapper.insertSelective(record);
    }

    @Override
    public PcTpcMqMessage selectByPrimaryKey(Long id) {
        return pcTpcMqMessageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcTpcMqMessage record) {
        return pcTpcMqMessageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcTpcMqMessage record) {
        return pcTpcMqMessageMapper.updateByPrimaryKey(record);
    }

}

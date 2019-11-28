package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PcTpcMqProducer;
import com.junbaobao.mapper.PcTpcMqProducerMapper;
import com.junbaobao.service.PcTpcMqProducerService;
@Service
public class PcTpcMqProducerServiceImpl implements PcTpcMqProducerService{

    @Resource
    private PcTpcMqProducerMapper pcTpcMqProducerMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcTpcMqProducerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcTpcMqProducer record) {
        return pcTpcMqProducerMapper.insert(record);
    }

    @Override
    public int insertSelective(PcTpcMqProducer record) {
        return pcTpcMqProducerMapper.insertSelective(record);
    }

    @Override
    public PcTpcMqProducer selectByPrimaryKey(Long id) {
        return pcTpcMqProducerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcTpcMqProducer record) {
        return pcTpcMqProducerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcTpcMqProducer record) {
        return pcTpcMqProducerMapper.updateByPrimaryKey(record);
    }

}

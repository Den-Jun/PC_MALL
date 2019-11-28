package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PcTpcMqConsumer;
import com.junbaobao.mapper.PcTpcMqConsumerMapper;
import com.junbaobao.service.PcTpcMqConsumerService;
@Service
public class PcTpcMqConsumerServiceImpl implements PcTpcMqConsumerService{

    @Resource
    private PcTpcMqConsumerMapper pcTpcMqConsumerMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcTpcMqConsumerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcTpcMqConsumer record) {
        return pcTpcMqConsumerMapper.insert(record);
    }

    @Override
    public int insertSelective(PcTpcMqConsumer record) {
        return pcTpcMqConsumerMapper.insertSelective(record);
    }

    @Override
    public PcTpcMqConsumer selectByPrimaryKey(Long id) {
        return pcTpcMqConsumerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcTpcMqConsumer record) {
        return pcTpcMqConsumerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcTpcMqConsumer record) {
        return pcTpcMqConsumerMapper.updateByPrimaryKey(record);
    }

}

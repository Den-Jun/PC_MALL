package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcTpcMqTopicMapper;
import com.junbaobao.model.PcTpcMqTopic;
import com.junbaobao.service.PcTpcMqTopicService;
@Service
public class PcTpcMqTopicServiceImpl implements PcTpcMqTopicService{

    @Resource
    private PcTpcMqTopicMapper pcTpcMqTopicMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcTpcMqTopicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcTpcMqTopic record) {
        return pcTpcMqTopicMapper.insert(record);
    }

    @Override
    public int insertSelective(PcTpcMqTopic record) {
        return pcTpcMqTopicMapper.insertSelective(record);
    }

    @Override
    public PcTpcMqTopic selectByPrimaryKey(Long id) {
        return pcTpcMqTopicMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcTpcMqTopic record) {
        return pcTpcMqTopicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcTpcMqTopic record) {
        return pcTpcMqTopicMapper.updateByPrimaryKey(record);
    }

}

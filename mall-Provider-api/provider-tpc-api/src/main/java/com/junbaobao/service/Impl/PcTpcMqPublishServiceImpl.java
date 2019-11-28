package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcTpcMqPublishMapper;
import com.junbaobao.model.PcTpcMqPublish;
import com.junbaobao.service.PcTpcMqPublishService;
@Service
public class PcTpcMqPublishServiceImpl implements PcTpcMqPublishService{

    @Resource
    private PcTpcMqPublishMapper pcTpcMqPublishMapper;

    @Override
    public int deleteByPrimaryKey(Long producerId,Long topicId) {
        return pcTpcMqPublishMapper.deleteByPrimaryKey(producerId,topicId);
    }

    @Override
    public int insert(PcTpcMqPublish record) {
        return pcTpcMqPublishMapper.insert(record);
    }

    @Override
    public int insertSelective(PcTpcMqPublish record) {
        return pcTpcMqPublishMapper.insertSelective(record);
    }

}

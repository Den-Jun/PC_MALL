package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PcTpcMqSubscribeTag;
import com.junbaobao.mapper.PcTpcMqSubscribeTagMapper;
import com.junbaobao.service.PcTpcMqSubscribeTagService;
@Service
public class PcTpcMqSubscribeTagServiceImpl implements PcTpcMqSubscribeTagService{

    @Resource
    private PcTpcMqSubscribeTagMapper pcTpcMqSubscribeTagMapper;

    @Override
    public int deleteByPrimaryKey(Long subscribeId,Long tagId) {
        return pcTpcMqSubscribeTagMapper.deleteByPrimaryKey(subscribeId,tagId);
    }

    @Override
    public int insert(PcTpcMqSubscribeTag record) {
        return pcTpcMqSubscribeTagMapper.insert(record);
    }

    @Override
    public int insertSelective(PcTpcMqSubscribeTag record) {
        return pcTpcMqSubscribeTagMapper.insertSelective(record);
    }

}

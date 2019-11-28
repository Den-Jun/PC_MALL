package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PcTpcMqSubscribe;
import com.junbaobao.mapper.PcTpcMqSubscribeMapper;
import com.junbaobao.service.PcTpcMqSubscribeService;
@Service
public class PcTpcMqSubscribeServiceImpl implements PcTpcMqSubscribeService{

    @Resource
    private PcTpcMqSubscribeMapper pcTpcMqSubscribeMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcTpcMqSubscribeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcTpcMqSubscribe record) {
        return pcTpcMqSubscribeMapper.insert(record);
    }

    @Override
    public int insertSelective(PcTpcMqSubscribe record) {
        return pcTpcMqSubscribeMapper.insertSelective(record);
    }

    @Override
    public PcTpcMqSubscribe selectByPrimaryKey(Long id) {
        return pcTpcMqSubscribeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcTpcMqSubscribe record) {
        return pcTpcMqSubscribeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcTpcMqSubscribe record) {
        return pcTpcMqSubscribeMapper.updateByPrimaryKey(record);
    }

}

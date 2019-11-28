package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcTpcMqTagMapper;
import com.junbaobao.model.PcTpcMqTag;
import com.junbaobao.service.PcTpcMqTagService;
@Service
public class PcTpcMqTagServiceImpl implements PcTpcMqTagService{

    @Resource
    private PcTpcMqTagMapper pcTpcMqTagMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcTpcMqTagMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcTpcMqTag record) {
        return pcTpcMqTagMapper.insert(record);
    }

    @Override
    public int insertSelective(PcTpcMqTag record) {
        return pcTpcMqTagMapper.insertSelective(record);
    }

    @Override
    public PcTpcMqTag selectByPrimaryKey(Long id) {
        return pcTpcMqTagMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcTpcMqTag record) {
        return pcTpcMqTagMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcTpcMqTag record) {
        return pcTpcMqTagMapper.updateByPrimaryKey(record);
    }

}

package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PcOmcShipping;
import com.junbaobao.mapper.PcOmcShippingMapper;
import com.junbaobao.service.PcOmcShippingService;
@Service
public class PcOmcShippingServiceImpl implements PcOmcShippingService{

    @Resource
    private PcOmcShippingMapper pcOmcShippingMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcOmcShippingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcOmcShipping record) {
        return pcOmcShippingMapper.insert(record);
    }

    @Override
    public int insertSelective(PcOmcShipping record) {
        return pcOmcShippingMapper.insertSelective(record);
    }

    @Override
    public PcOmcShipping selectByPrimaryKey(Long id) {
        return pcOmcShippingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcOmcShipping record) {
        return pcOmcShippingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcOmcShipping record) {
        return pcOmcShippingMapper.updateByPrimaryKey(record);
    }

}

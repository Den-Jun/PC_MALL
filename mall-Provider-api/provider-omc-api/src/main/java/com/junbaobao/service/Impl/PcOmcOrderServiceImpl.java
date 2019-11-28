package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcOmcOrderMapper;
import com.junbaobao.model.PcOmcOrder;
import com.junbaobao.service.PcOmcOrderService;
@Service
public class PcOmcOrderServiceImpl implements PcOmcOrderService{

    @Resource
    private PcOmcOrderMapper pcOmcOrderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcOmcOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcOmcOrder record) {
        return pcOmcOrderMapper.insert(record);
    }

    @Override
    public int insertSelective(PcOmcOrder record) {
        return pcOmcOrderMapper.insertSelective(record);
    }

    @Override
    public PcOmcOrder selectByPrimaryKey(Long id) {
        return pcOmcOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcOmcOrder record) {
        return pcOmcOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcOmcOrder record) {
        return pcOmcOrderMapper.updateByPrimaryKey(record);
    }

}

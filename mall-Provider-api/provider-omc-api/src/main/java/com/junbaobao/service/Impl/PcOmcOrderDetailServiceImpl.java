package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PcOmcOrderDetail;
import com.junbaobao.mapper.PcOmcOrderDetailMapper;
import com.junbaobao.service.PcOmcOrderDetailService;
@Service
public class PcOmcOrderDetailServiceImpl implements PcOmcOrderDetailService{

    @Resource
    private PcOmcOrderDetailMapper pcOmcOrderDetailMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcOmcOrderDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcOmcOrderDetail record) {
        return pcOmcOrderDetailMapper.insert(record);
    }

    @Override
    public int insertSelective(PcOmcOrderDetail record) {
        return pcOmcOrderDetailMapper.insertSelective(record);
    }

    @Override
    public PcOmcOrderDetail selectByPrimaryKey(Long id) {
        return pcOmcOrderDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcOmcOrderDetail record) {
        return pcOmcOrderDetailMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcOmcOrderDetail record) {
        return pcOmcOrderDetailMapper.updateByPrimaryKey(record);
    }

}

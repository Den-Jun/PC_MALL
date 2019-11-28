package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcOmcCartMapper;
import com.junbaobao.model.PcOmcCart;
import com.junbaobao.service.PcOmcCartService;
@Service
public class PcOmcCartServiceImpl implements PcOmcCartService{

    @Resource
    private PcOmcCartMapper pcOmcCartMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcOmcCartMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcOmcCart record) {
        return pcOmcCartMapper.insert(record);
    }

    @Override
    public int insertSelective(PcOmcCart record) {
        return pcOmcCartMapper.insertSelective(record);
    }

    @Override
    public PcOmcCart selectByPrimaryKey(Long id) {
        return pcOmcCartMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcOmcCart record) {
        return pcOmcCartMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcOmcCart record) {
        return pcOmcCartMapper.updateByPrimaryKey(record);
    }

}

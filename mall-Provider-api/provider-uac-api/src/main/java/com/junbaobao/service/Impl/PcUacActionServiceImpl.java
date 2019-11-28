package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcUacActionMapper;
import com.junbaobao.model.PcUacAction;
import com.junbaobao.service.PcUacActionService;
@Service
public class PcUacActionServiceImpl implements PcUacActionService{

    @Resource
    private PcUacActionMapper pcUacActionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcUacActionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcUacAction record) {
        return pcUacActionMapper.insert(record);
    }

    @Override
    public int insertSelective(PcUacAction record) {
        return pcUacActionMapper.insertSelective(record);
    }

    @Override
    public PcUacAction selectByPrimaryKey(Long id) {
        return pcUacActionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcUacAction record) {
        return pcUacActionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcUacAction record) {
        return pcUacActionMapper.updateByPrimaryKey(record);
    }

}

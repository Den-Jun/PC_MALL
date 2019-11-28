package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PcUacApplication;
import com.junbaobao.mapper.PcUacApplicationMapper;
import com.junbaobao.service.PcUacApplicationService;
@Service
public class PcUacApplicationServiceImpl implements PcUacApplicationService{

    @Resource
    private PcUacApplicationMapper pcUacApplicationMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcUacApplicationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcUacApplication record) {
        return pcUacApplicationMapper.insert(record);
    }

    @Override
    public int insertSelective(PcUacApplication record) {
        return pcUacApplicationMapper.insertSelective(record);
    }

    @Override
    public PcUacApplication selectByPrimaryKey(Long id) {
        return pcUacApplicationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcUacApplication record) {
        return pcUacApplicationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcUacApplication record) {
        return pcUacApplicationMapper.updateByPrimaryKey(record);
    }

}

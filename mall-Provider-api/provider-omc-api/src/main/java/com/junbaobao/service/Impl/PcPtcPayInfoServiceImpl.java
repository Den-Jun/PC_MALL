package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcPtcPayInfoMapper;
import com.junbaobao.model.PcPtcPayInfo;
import com.junbaobao.service.PcPtcPayInfoService;
@Service
public class PcPtcPayInfoServiceImpl implements PcPtcPayInfoService{

    @Resource
    private PcPtcPayInfoMapper pcPtcPayInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcPtcPayInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcPtcPayInfo record) {
        return pcPtcPayInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(PcPtcPayInfo record) {
        return pcPtcPayInfoMapper.insertSelective(record);
    }

    @Override
    public PcPtcPayInfo selectByPrimaryKey(Long id) {
        return pcPtcPayInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcPtcPayInfo record) {
        return pcPtcPayInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcPtcPayInfo record) {
        return pcPtcPayInfoMapper.updateByPrimaryKey(record);
    }

}

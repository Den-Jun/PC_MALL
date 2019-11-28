package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.junbaobao.model.PcMdcAddress;
import com.junbaobao.mapper.PcMdcAddressMapper;
import com.junbaobao.service.PcMdcAddressService;

@Service
public class PcMdcAddressServiceImpl implements PcMdcAddressService {

    @Resource
    private PcMdcAddressMapper pcMdcAddressMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcMdcAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcMdcAddress record) {
        return pcMdcAddressMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PcMdcAddress record) {
        return pcMdcAddressMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PcMdcAddress record) {
        return pcMdcAddressMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PcMdcAddress record) {
        return pcMdcAddressMapper.insertSelective(record);
    }

    @Override
    public PcMdcAddress selectByPrimaryKey(Long id) {
        return pcMdcAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcMdcAddress record) {
        return pcMdcAddressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcMdcAddress record) {
        return pcMdcAddressMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PcMdcAddress> list) {
        return pcMdcAddressMapper.updateBatch(list);
    }

}



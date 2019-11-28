package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcMdcProductMapper;
import java.util.List;
import com.junbaobao.model.PcMdcProduct;
import com.junbaobao.service.PcMdcProductService;

@Service
public class PcMdcProductServiceImpl implements PcMdcProductService {

    @Resource
    private PcMdcProductMapper pcMdcProductMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcMdcProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcMdcProduct record) {
        return pcMdcProductMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PcMdcProduct record) {
        return pcMdcProductMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PcMdcProduct record) {
        return pcMdcProductMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PcMdcProduct record) {
        return pcMdcProductMapper.insertSelective(record);
    }

    @Override
    public PcMdcProduct selectByPrimaryKey(Long id) {
        return pcMdcProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcMdcProduct record) {
        return pcMdcProductMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcMdcProduct record) {
        return pcMdcProductMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PcMdcProduct> list) {
        return pcMdcProductMapper.updateBatch(list);
    }

}



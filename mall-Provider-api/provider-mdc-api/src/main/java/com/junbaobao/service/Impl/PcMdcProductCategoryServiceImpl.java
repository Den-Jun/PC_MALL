package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.junbaobao.model.PcMdcProductCategory;
import com.junbaobao.mapper.PcMdcProductCategoryMapper;
import com.junbaobao.service.PcMdcProductCategoryService;

@Service
public class PcMdcProductCategoryServiceImpl implements PcMdcProductCategoryService {

    @Resource
    private PcMdcProductCategoryMapper pcMdcProductCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcMdcProductCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcMdcProductCategory record) {
        return pcMdcProductCategoryMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PcMdcProductCategory record) {
        return pcMdcProductCategoryMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PcMdcProductCategory record) {
        return pcMdcProductCategoryMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PcMdcProductCategory record) {
        return pcMdcProductCategoryMapper.insertSelective(record);
    }

    @Override
    public PcMdcProductCategory selectByPrimaryKey(Long id) {
        return pcMdcProductCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcMdcProductCategory record) {
        return pcMdcProductCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcMdcProductCategory record) {
        return pcMdcProductCategoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PcMdcProductCategory> list) {
        return pcMdcProductCategoryMapper.updateBatch(list);
    }

}



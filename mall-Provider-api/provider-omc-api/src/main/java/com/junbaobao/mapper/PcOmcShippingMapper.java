package com.junbaobao.mapper;

import com.junbaobao.model.PcOmcShipping;

public interface PcOmcShippingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcOmcShipping record);

    int insertSelective(PcOmcShipping record);

    PcOmcShipping selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcOmcShipping record);

    int updateByPrimaryKey(PcOmcShipping record);
}
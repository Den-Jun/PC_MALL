package com.junbaobao.mapper;

import com.junbaobao.model.PcOmcOrder;

public interface PcOmcOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcOmcOrder record);

    int insertSelective(PcOmcOrder record);

    PcOmcOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcOmcOrder record);

    int updateByPrimaryKey(PcOmcOrder record);
}
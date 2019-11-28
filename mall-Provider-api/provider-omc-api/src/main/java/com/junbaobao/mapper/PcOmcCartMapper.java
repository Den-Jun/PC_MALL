package com.junbaobao.mapper;

import com.junbaobao.model.PcOmcCart;

public interface PcOmcCartMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcOmcCart record);

    int insertSelective(PcOmcCart record);

    PcOmcCart selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcOmcCart record);

    int updateByPrimaryKey(PcOmcCart record);
}
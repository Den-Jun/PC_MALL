package com.junbaobao.mapper;

import com.junbaobao.model.PcUacAction;

public interface PcUacActionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcUacAction record);

    int insertSelective(PcUacAction record);

    PcUacAction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcUacAction record);

    int updateByPrimaryKey(PcUacAction record);
}
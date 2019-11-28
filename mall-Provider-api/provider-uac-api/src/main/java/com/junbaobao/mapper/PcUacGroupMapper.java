package com.junbaobao.mapper;

import com.junbaobao.model.PcUacGroup;

public interface PcUacGroupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcUacGroup record);

    int insertSelective(PcUacGroup record);

    PcUacGroup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcUacGroup record);

    int updateByPrimaryKey(PcUacGroup record);
}
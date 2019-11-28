package com.junbaobao.mapper;

import com.junbaobao.model.PcUacMenu;

public interface PcUacMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcUacMenu record);

    int insertSelective(PcUacMenu record);

    PcUacMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcUacMenu record);

    int updateByPrimaryKey(PcUacMenu record);
}
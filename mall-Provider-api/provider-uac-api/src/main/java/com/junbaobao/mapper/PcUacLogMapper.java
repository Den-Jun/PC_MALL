package com.junbaobao.mapper;

import com.junbaobao.model.PcUacLog;

public interface PcUacLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcUacLog record);

    int insertSelective(PcUacLog record);

    PcUacLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcUacLog record);

    int updateByPrimaryKey(PcUacLog record);
}
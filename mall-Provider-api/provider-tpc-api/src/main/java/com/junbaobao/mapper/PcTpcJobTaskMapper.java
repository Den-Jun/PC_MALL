package com.junbaobao.mapper;

import com.junbaobao.model.PcTpcJobTask;

public interface PcTpcJobTaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcTpcJobTask record);

    int insertSelective(PcTpcJobTask record);

    PcTpcJobTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcTpcJobTask record);

    int updateByPrimaryKey(PcTpcJobTask record);
}
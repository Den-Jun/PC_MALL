package com.junbaobao.mapper;

import com.junbaobao.model.PcUacApplication;

public interface PcUacApplicationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcUacApplication record);

    int insertSelective(PcUacApplication record);

    PcUacApplication selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcUacApplication record);

    int updateByPrimaryKey(PcUacApplication record);
}
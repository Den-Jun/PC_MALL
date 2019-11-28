package com.junbaobao.mapper;

import com.junbaobao.model.PcTpcMqConfirm;

public interface PcTpcMqConfirmMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcTpcMqConfirm record);

    int insertSelective(PcTpcMqConfirm record);

    PcTpcMqConfirm selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcTpcMqConfirm record);

    int updateByPrimaryKey(PcTpcMqConfirm record);
}
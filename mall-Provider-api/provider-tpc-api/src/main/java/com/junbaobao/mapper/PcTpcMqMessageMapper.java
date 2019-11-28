package com.junbaobao.mapper;

import com.junbaobao.model.PcTpcMqMessage;

public interface PcTpcMqMessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcTpcMqMessage record);

    int insertSelective(PcTpcMqMessage record);

    PcTpcMqMessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcTpcMqMessage record);

    int updateByPrimaryKey(PcTpcMqMessage record);
}
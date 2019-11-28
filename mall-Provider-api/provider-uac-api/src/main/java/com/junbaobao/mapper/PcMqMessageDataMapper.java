package com.junbaobao.mapper;

import com.junbaobao.model.PcMqMessageData;

public interface PcMqMessageDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcMqMessageData record);

    int insertSelective(PcMqMessageData record);

    PcMqMessageData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcMqMessageData record);

    int updateByPrimaryKey(PcMqMessageData record);
}
package com.junbaobao.mapper;

import com.junbaobao.model.PcTpcMqConsumer;

public interface PcTpcMqConsumerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcTpcMqConsumer record);

    int insertSelective(PcTpcMqConsumer record);

    PcTpcMqConsumer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcTpcMqConsumer record);

    int updateByPrimaryKey(PcTpcMqConsumer record);
}
package com.junbaobao.mapper;

import com.junbaobao.model.PcTpcMqTopic;

public interface PcTpcMqTopicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcTpcMqTopic record);

    int insertSelective(PcTpcMqTopic record);

    PcTpcMqTopic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcTpcMqTopic record);

    int updateByPrimaryKey(PcTpcMqTopic record);
}
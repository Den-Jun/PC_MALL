package com.junbaobao.mapper;

import com.junbaobao.model.PcTpcMqProducer;

public interface PcTpcMqProducerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcTpcMqProducer record);

    int insertSelective(PcTpcMqProducer record);

    PcTpcMqProducer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcTpcMqProducer record);

    int updateByPrimaryKey(PcTpcMqProducer record);
}
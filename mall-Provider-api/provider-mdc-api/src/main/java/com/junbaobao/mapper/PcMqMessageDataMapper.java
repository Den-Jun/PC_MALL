package com.junbaobao.mapper;

import com.junbaobao.model.PcMqMessageData;
import java.util.List;

public interface PcMqMessageDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcMqMessageData record);

    int insertOrUpdate(PcMqMessageData record);

    int insertOrUpdateSelective(PcMqMessageData record);

    int insertSelective(PcMqMessageData record);

    PcMqMessageData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcMqMessageData record);

    int updateByPrimaryKey(PcMqMessageData record);

    int updateBatch(List<PcMqMessageData> list);
}
package com.junbaobao.mapper;

import com.junbaobao.model.PcTpcMqPublish;
import org.apache.ibatis.annotations.Param;

public interface PcTpcMqPublishMapper {
    int deleteByPrimaryKey(@Param("producerId") Long producerId, @Param("topicId") Long topicId);

    int insert(PcTpcMqPublish record);

    int insertSelective(PcTpcMqPublish record);
}
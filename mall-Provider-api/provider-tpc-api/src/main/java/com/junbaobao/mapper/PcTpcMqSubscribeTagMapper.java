package com.junbaobao.mapper;

import com.junbaobao.model.PcTpcMqSubscribeTag;
import org.apache.ibatis.annotations.Param;

public interface PcTpcMqSubscribeTagMapper {
    int deleteByPrimaryKey(@Param("subscribeId") Long subscribeId, @Param("tagId") Long tagId);

    int insert(PcTpcMqSubscribeTag record);

    int insertSelective(PcTpcMqSubscribeTag record);
}
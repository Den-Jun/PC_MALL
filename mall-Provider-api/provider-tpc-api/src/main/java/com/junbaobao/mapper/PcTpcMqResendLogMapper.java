package com.junbaobao.mapper;

import com.junbaobao.model.PcTpcMqResendLog;

public interface PcTpcMqResendLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcTpcMqResendLog record);

    int insertSelective(PcTpcMqResendLog record);

    PcTpcMqResendLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcTpcMqResendLog record);

    int updateByPrimaryKey(PcTpcMqResendLog record);
}
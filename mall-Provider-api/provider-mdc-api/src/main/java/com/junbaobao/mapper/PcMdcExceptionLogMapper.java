package com.junbaobao.mapper;

import com.junbaobao.model.PcMdcExceptionLog;
import java.util.List;

public interface PcMdcExceptionLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcMdcExceptionLog record);

    int insertOrUpdate(PcMdcExceptionLog record);

    int insertOrUpdateSelective(PcMdcExceptionLog record);

    int insertSelective(PcMdcExceptionLog record);

    PcMdcExceptionLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcMdcExceptionLog record);

    int updateByPrimaryKey(PcMdcExceptionLog record);

    int updateBatch(List<PcMdcExceptionLog> list);
}
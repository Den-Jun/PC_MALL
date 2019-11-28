package com.junbaobao.service;

import java.util.List;
import com.junbaobao.model.PcMdcExceptionLog;

public interface PcMdcExceptionLogService {


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



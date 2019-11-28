package com.junbaobao.mapper;

import com.junbaobao.model.PcMdcAddress;
import java.util.List;

public interface PcMdcAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcMdcAddress record);

    int insertOrUpdate(PcMdcAddress record);

    int insertOrUpdateSelective(PcMdcAddress record);

    int insertSelective(PcMdcAddress record);

    PcMdcAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcMdcAddress record);

    int updateByPrimaryKey(PcMdcAddress record);

    int updateBatch(List<PcMdcAddress> list);
}
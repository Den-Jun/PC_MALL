package com.junbaobao.mapper;

import com.junbaobao.model.PcMdcDict;
import java.util.List;

public interface PcMdcDictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcMdcDict record);

    int insertOrUpdate(PcMdcDict record);

    int insertOrUpdateSelective(PcMdcDict record);

    int insertSelective(PcMdcDict record);

    PcMdcDict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcMdcDict record);

    int updateByPrimaryKey(PcMdcDict record);

    int updateBatch(List<PcMdcDict> list);
}
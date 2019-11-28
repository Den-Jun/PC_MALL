package com.junbaobao.mapper;

import com.junbaobao.model.PcMdcProduct;
import java.util.List;

public interface PcMdcProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcMdcProduct record);

    int insertOrUpdate(PcMdcProduct record);

    int insertOrUpdateSelective(PcMdcProduct record);

    int insertSelective(PcMdcProduct record);

    PcMdcProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcMdcProduct record);

    int updateByPrimaryKey(PcMdcProduct record);

    int updateBatch(List<PcMdcProduct> list);
}
package com.junbaobao.mapper;

import com.junbaobao.model.PcMdcProductCategory;
import java.util.List;

public interface PcMdcProductCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcMdcProductCategory record);

    int insertOrUpdate(PcMdcProductCategory record);

    int insertOrUpdateSelective(PcMdcProductCategory record);

    int insertSelective(PcMdcProductCategory record);

    PcMdcProductCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcMdcProductCategory record);

    int updateByPrimaryKey(PcMdcProductCategory record);

    int updateBatch(List<PcMdcProductCategory> list);
}
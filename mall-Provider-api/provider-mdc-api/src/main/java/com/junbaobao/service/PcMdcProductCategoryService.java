package com.junbaobao.service;

import java.util.List;
import com.junbaobao.model.PcMdcProductCategory;

public interface PcMdcProductCategoryService {


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



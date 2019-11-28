package com.junbaobao.service;

import java.util.List;
import com.junbaobao.model.PcMdcProduct;

public interface PcMdcProductService {


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



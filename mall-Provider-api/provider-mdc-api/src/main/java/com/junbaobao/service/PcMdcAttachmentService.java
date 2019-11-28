package com.junbaobao.service;

import java.util.List;
import com.junbaobao.model.PcMdcAttachment;

public interface PcMdcAttachmentService {


    int deleteByPrimaryKey(String id);

    int insert(PcMdcAttachment record);

    int insertOrUpdate(PcMdcAttachment record);

    int insertOrUpdateSelective(PcMdcAttachment record);

    int insertSelective(PcMdcAttachment record);

    PcMdcAttachment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PcMdcAttachment record);

    int updateByPrimaryKey(PcMdcAttachment record);

    int updateBatch(List<PcMdcAttachment> list);

}



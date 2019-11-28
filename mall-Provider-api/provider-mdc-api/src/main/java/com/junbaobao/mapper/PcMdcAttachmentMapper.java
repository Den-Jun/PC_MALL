package com.junbaobao.mapper;

import com.junbaobao.model.PcMdcAttachment;
import java.util.List;

public interface PcMdcAttachmentMapper {
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
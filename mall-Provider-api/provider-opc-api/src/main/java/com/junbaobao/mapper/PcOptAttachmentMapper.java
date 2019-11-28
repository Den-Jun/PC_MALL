package com.junbaobao.mapper;

import com.junbaobao.model.PcOptAttachment;

public interface PcOptAttachmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcOptAttachment record);

    int insertSelective(PcOptAttachment record);

    PcOptAttachment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcOptAttachment record);

    int updateByPrimaryKey(PcOptAttachment record);
}
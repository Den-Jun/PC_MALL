package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.junbaobao.model.PcMdcExceptionLog;
import com.junbaobao.mapper.PcMdcExceptionLogMapper;
import com.junbaobao.service.PcMdcExceptionLogService;

@Service
public class PcMdcExceptionLogServiceImpl implements PcMdcExceptionLogService {

    @Resource
    private PcMdcExceptionLogMapper pcMdcExceptionLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcMdcExceptionLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcMdcExceptionLog record) {
        return pcMdcExceptionLogMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PcMdcExceptionLog record) {
        return pcMdcExceptionLogMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PcMdcExceptionLog record) {
        return pcMdcExceptionLogMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PcMdcExceptionLog record) {
        return pcMdcExceptionLogMapper.insertSelective(record);
    }

    @Override
    public PcMdcExceptionLog selectByPrimaryKey(Long id) {
        return pcMdcExceptionLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcMdcExceptionLog record) {
        return pcMdcExceptionLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcMdcExceptionLog record) {
        return pcMdcExceptionLogMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PcMdcExceptionLog> list) {
        return pcMdcExceptionLogMapper.updateBatch(list);
    }

}



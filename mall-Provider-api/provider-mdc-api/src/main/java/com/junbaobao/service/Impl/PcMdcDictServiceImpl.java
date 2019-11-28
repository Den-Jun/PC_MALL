package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.junbaobao.model.PcMdcDict;
import com.junbaobao.mapper.PcMdcDictMapper;
import com.junbaobao.service.PcMdcDictService;

@Service
public class PcMdcDictServiceImpl implements PcMdcDictService {

    @Resource
    private PcMdcDictMapper pcMdcDictMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcMdcDictMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcMdcDict record) {
        return pcMdcDictMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PcMdcDict record) {
        return pcMdcDictMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PcMdcDict record) {
        return pcMdcDictMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PcMdcDict record) {
        return pcMdcDictMapper.insertSelective(record);
    }

    @Override
    public PcMdcDict selectByPrimaryKey(Long id) {
        return pcMdcDictMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcMdcDict record) {
        return pcMdcDictMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcMdcDict record) {
        return pcMdcDictMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PcMdcDict> list) {
        return pcMdcDictMapper.updateBatch(list);
    }

}



package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PersistentLogins;
import com.junbaobao.mapper.PersistentLoginsMapper;
import com.junbaobao.service.PersistentLoginsService;
@Service
public class PersistentLoginsServiceImpl implements PersistentLoginsService{

    @Resource
    private PersistentLoginsMapper persistentLoginsMapper;

    @Override
    public int deleteByPrimaryKey(String series) {
        return persistentLoginsMapper.deleteByPrimaryKey(series);
    }

    @Override
    public int insert(PersistentLogins record) {
        return persistentLoginsMapper.insert(record);
    }

    @Override
    public int insertSelective(PersistentLogins record) {
        return persistentLoginsMapper.insertSelective(record);
    }

    @Override
    public PersistentLogins selectByPrimaryKey(String series) {
        return persistentLoginsMapper.selectByPrimaryKey(series);
    }

    @Override
    public int updateByPrimaryKeySelective(PersistentLogins record) {
        return persistentLoginsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PersistentLogins record) {
        return persistentLoginsMapper.updateByPrimaryKey(record);
    }

}

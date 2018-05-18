package com.dfire.common.service.impl;

import com.dfire.common.entity.HeraUser;
import com.dfire.common.mapper.HeraUserMapper;
import com.dfire.common.mybatis.HeraInsertLangDriver;
import com.dfire.common.mybatis.HeraSelectInLangDriver;
import com.dfire.common.mybatis.HeraSelectLangDriver;
import com.dfire.common.mybatis.HeraUpdateLangDriver;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dfire.common.service.HeraUserService;

import java.util.List;

/**
 * @author: <a href="mailto:lingxiao@2dfire.com">凌霄</a>
 * @time: Created in 0:35 2017/12/30
 * @desc
 */
@Service("heraUserService")
public class HeraUserServiceImpl implements HeraUserService {

    @Autowired
    private HeraUserMapper heraUserMapper;


    @Override
    public int insert(HeraUser heraUser) {
        return heraUserMapper.insert(heraUser);
    }

    @Override
    public int delete(String id) {
        return heraUserMapper.delete(id);
    }

    @Override
    public int update(HeraUser heraUser) {
        return heraUserMapper.update(heraUser);
    }

    @Override
    public List<HeraUser> getAll() {
        return heraUserMapper.getAll();
    }

    @Override
    public HeraUser findById(HeraUser heraUser) {
        return heraUserMapper.findById(heraUser);
    }

    @Override
    public HeraUser findByName(String name) {
        HeraUser heraUser = HeraUser.builder().name(name).build();
        return heraUserMapper.getByName(heraUser);
    }

    @Override
    public List<HeraUser> findByIds(List<Integer> list) {
        return heraUserMapper.findByIds(list);
    }
}
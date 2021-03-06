package com.flyloong.ticketsystem.rpc.service.impl;

import com.flyloong.common.annotation.BaseService;
import com.flyloong.common.base.BaseServiceImpl;
import com.flyloong.ticketsystem.dao.mapper.FlUserMapper;
import com.flyloong.ticketsystem.dao.model.FlUser;
import com.flyloong.ticketsystem.dao.model.FlUserExample;
import com.flyloong.ticketsystem.rpc.api.FlUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FlUserService实现
* Created by flyloong on 2018/3/20.
*/
@Service
@Transactional
@BaseService
public class FlUserServiceImpl extends BaseServiceImpl<FlUserMapper, FlUser, FlUserExample> implements FlUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlUserServiceImpl.class);

    @Autowired
    FlUserMapper flUserMapper;

}
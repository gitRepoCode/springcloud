package com.imooc.user.service.impl;

import com.imooc.user.entity.UserInfo;
import com.imooc.user.repository.UserInfoRepository;
import com.imooc.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Miracle Luna
 * @Date 2020/4/2 14:02
 * @Version 1.0
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoRepository userInfoRepository;
    /**
     * 通过openid来查询用户信息
     *
     * @param openid
     * @return
     */
    @Override
    public UserInfo findByOpenid(String openid) {
        return userInfoRepository.findByOpenid(openid);
    }
}

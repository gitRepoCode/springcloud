package com.imooc.user.service;

import com.imooc.user.entity.UserInfo;

/**
 * @Author Miracle Luna
 * @Date 2020/4/2 14:01
 * @Version 1.0
 */
public interface UserInfoService {
    /**
     * 通过openid来查询用户信息
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}

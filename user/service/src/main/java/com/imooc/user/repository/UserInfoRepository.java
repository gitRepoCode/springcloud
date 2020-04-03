package com.imooc.user.repository;

import com.imooc.user.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Miracle Luna
 * @Date 2020/4/2 14:01
 * @Version 1.0
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {
    UserInfo findByOpenid(String openid);
}

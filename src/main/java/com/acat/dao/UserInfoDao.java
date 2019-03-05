package com.acat.dao;

import com.acat.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoDao extends JpaRepository<UserInfoEntity,Integer> {

    UserInfoEntity getUserInfoEntityByBishe_userInfo_registerId();

}

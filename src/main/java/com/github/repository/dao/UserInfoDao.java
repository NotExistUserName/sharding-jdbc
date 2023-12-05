package com.github.repository.dao;

import lombok.extern.slf4j.Slf4j;
import com.github.repository.entity.UserInfo;
import com.github.repository.mapper.UserInfoMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;

/**
 * (t_user_info)数据DAO
 *
 * @author coffe
 * @since 2023-12-05 12:42:33
 * @description 
 */
@Slf4j
@Repository
public class UserInfoDao extends ServiceImpl<UserInfoMapper, UserInfo> {

}
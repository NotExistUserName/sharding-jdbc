package com.github.repository.dao;

import com.github.repository.entity.UserInfo;
import lombok.extern.slf4j.Slf4j;
import com.github.repository.entity.OrderInfo;
import com.github.repository.mapper.OrderInfoMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * (t_order_info)数据DAO
 *
 * @author coffe
 * @since 2023-12-03 12:22:18
 * @description 
 */
@Slf4j
@Repository
public class OrderInfoDao extends ServiceImpl<OrderInfoMapper, OrderInfo> {

    @Autowired
    private UserInfoDao userInfoDao;

    @Transactional(rollbackFor = Exception.class)
    // 分布式事务需要开启此注解
//    @ShardingTransactionType(TransactionType.LOCAL)
    public void saveUserOrder() {

        OrderInfo saveOrderInfo = new OrderInfo();
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis:" + currentTimeMillis);
        saveOrderInfo.setOrderId(currentTimeMillis);
        saveOrderInfo.setUid(currentTimeMillis);
        saveOrderInfo.setProductId(currentTimeMillis);
        save(saveOrderInfo);

        UserInfo saveUserInfo = new UserInfo();
        saveUserInfo.setUid(1L/0L);
        saveUserInfo.setUsername("测试回滚");
        saveUserInfo.setMobile("18888888888");
        userInfoDao.save(saveUserInfo);

    }

}
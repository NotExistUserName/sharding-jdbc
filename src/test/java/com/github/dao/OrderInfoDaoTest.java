package com.github.dao;

import com.github.BaseTest;
import com.github.repository.dao.OrderInfoDao;
import com.github.repository.entity.OrderInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @author: xx01
 * @date: 2023/12/3 12:27
 */
public class OrderInfoDaoTest extends BaseTest {

    @Autowired
    private OrderInfoDao orderInfoDao;

    @Test
    public void queryOrderInfo() {
        System.out.println(orderInfoDao.lambdaQuery().eq(OrderInfo::getOrderId, 1).one());
    }
}

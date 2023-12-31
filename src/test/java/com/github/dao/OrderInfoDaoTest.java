package com.github.dao;

import com.github.BaseTest;
import com.github.repository.dao.OrderInfoDao;
import com.github.repository.entity.OrderInfo;
import org.apache.shardingsphere.api.hint.HintManager;
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
    public void testQueryOrderInfoSlave() {
        System.out.println(orderInfoDao.lambdaQuery().eq(OrderInfo::getOrderId, 1).one());
    }

    @Test
    public void queryOrderInfo() {
        try (HintManager hintManager = HintManager.getInstance()) {
            hintManager.setMasterRouteOnly();
            System.out.println(orderInfoDao.lambdaQuery().eq(OrderInfo::getOrderId, 1).one());
        }
        System.out.println(orderInfoDao.lambdaQuery().eq(OrderInfo::getOrderId, 2).one());
    }

    @Test
    public void testTransaction() {
        orderInfoDao.saveUserOrder();
    }
}

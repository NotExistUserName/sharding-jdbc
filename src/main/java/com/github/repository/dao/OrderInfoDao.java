package com.github.repository.dao;

import lombok.extern.slf4j.Slf4j;
import com.github.repository.entity.OrderInfo;
import com.github.repository.mapper.OrderInfoMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;

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

}
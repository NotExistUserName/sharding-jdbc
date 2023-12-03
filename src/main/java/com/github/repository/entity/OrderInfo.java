package com.github.repository.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (t_order_info)实体类
 *
 * @author coffe
 * @since 2023-12-03 12:22:18
 * @description 
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("t_order_info")
public class OrderInfo extends Model<OrderInfo> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 订单号
     */
    @TableId(type = IdType.INPUT)
	private Long orderId;
    /**
     * 用户ID
     */
    private Long uid;
    /**
     * 商品ID
     */
    private Long productId;

}
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
 * (t_user_info)实体类
 *
 * @author coffe
 * @since 2023-12-05 12:42:33
 * @description 
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("t_user_info")
public class UserInfo extends Model<UserInfo> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(type = IdType.INPUT)
	private Long uid;
    /**
     * 用户姓名
     */
    private String username;
    /**
     * 用户手机号
     */
    private String mobile;

}
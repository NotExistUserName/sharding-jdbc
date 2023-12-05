package com.github.repository.mapper;

import com.github.repository.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * (t_user_info)数据Mapper
 *
 * @author coffe
 * @since 2023-12-05 12:42:33
 * @description 
*/
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}

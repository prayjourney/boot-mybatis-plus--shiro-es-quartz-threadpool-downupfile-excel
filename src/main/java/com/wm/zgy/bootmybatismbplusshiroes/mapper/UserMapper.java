package com.wm.zgy.bootmybatismbplusshiroes.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wm.zgy.bootmybatismbplusshiroes.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/5/17 21:50
 * @Modified by:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
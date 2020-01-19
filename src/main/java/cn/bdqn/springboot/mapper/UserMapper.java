package cn.bdqn.springboot.mapper;

import cn.bdqn.springboot.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhangxiangyang
 * @since 2020-01-14
 */
public interface UserMapper extends BaseMapper<User> {

    /*
    方法
    查询所有用户
     */
    List<User> findAllUser();

}

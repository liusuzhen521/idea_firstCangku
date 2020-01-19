package cn.bdqn.springboot.service;

import cn.bdqn.springboot.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangxiangyang
 * @since 2020-01-14
 */
public interface IUserService extends IService<User> {

    /*
   方法
   查询所有用户
    */
    List<User> findAllUser();


    /*
   方法  Mapper Service接口
   查询所有用户
    */
    List<User> findAll();



}

package cn.bdqn.springboot.service.impl;

import cn.bdqn.springboot.entity.User;
import cn.bdqn.springboot.mapper.UserMapper;
import cn.bdqn.springboot.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangxiangyang
 * @since 2020-01-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    //实例化mapper层
    @Resource
    private UserMapper userMapper;


    /*
   方法
   查询所有用户
    */
    @Override
    public List<User> findAllUser() {
      List<User> list=userMapper.findAllUser();
      if(list!=null){
          return list;

      }else{
          return  null;
      }
    }




    /*
   方法  Mapper Service接口
   查询所有用户
    */
    @Override
    public List<User> findAll() {

        List<User> list= userMapper.selectList(null);
        if(list!=null){
            return list;

        }else{
            return  null;
        }
    }
}

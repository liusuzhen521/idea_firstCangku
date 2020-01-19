package cn.bdqn.springboot.service.impl;

import cn.bdqn.springboot.entity.Role;
import cn.bdqn.springboot.mapper.RoleMapper;
import cn.bdqn.springboot.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangxiangyang
 * @since 2020-01-14
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}

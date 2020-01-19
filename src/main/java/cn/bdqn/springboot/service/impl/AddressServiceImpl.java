package cn.bdqn.springboot.service.impl;

import cn.bdqn.springboot.entity.Address;
import cn.bdqn.springboot.mapper.AddressMapper;
import cn.bdqn.springboot.service.IAddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}

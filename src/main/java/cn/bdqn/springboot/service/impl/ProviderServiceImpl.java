package cn.bdqn.springboot.service.impl;

import cn.bdqn.springboot.entity.Provider;
import cn.bdqn.springboot.mapper.ProviderMapper;
import cn.bdqn.springboot.service.IProviderService;
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
public class ProviderServiceImpl extends ServiceImpl<ProviderMapper, Provider> implements IProviderService {

}

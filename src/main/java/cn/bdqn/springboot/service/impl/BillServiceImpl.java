package cn.bdqn.springboot.service.impl;

import cn.bdqn.springboot.entity.Bill;
import cn.bdqn.springboot.mapper.BillMapper;
import cn.bdqn.springboot.service.IBillService;
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
public class BillServiceImpl extends ServiceImpl<BillMapper, Bill> implements IBillService {

}

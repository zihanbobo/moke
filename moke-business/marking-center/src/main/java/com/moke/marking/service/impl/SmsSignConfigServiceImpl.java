package com.moke.marking.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.moke.common.entity.sms.SmsSignConfig;
import com.moke.marking.mapper.SmsSignConfigMapper;
import com.moke.marking.service.ISmsSignConfigService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 签到配置表 服务实现类
 * </p>
 *
 * @author zscat
 * @since 2019-10-17
 */
@Service
public class SmsSignConfigServiceImpl extends ServiceImpl<SmsSignConfigMapper, SmsSignConfig> implements ISmsSignConfigService {

}
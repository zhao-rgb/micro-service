package com.soft1851.usercenter.service.impl;

import com.soft1851.usercenter.dao.BonusEventLogMapper;
import com.soft1851.usercenter.domain.entity.BonusEventLog;
import com.soft1851.usercenter.service.BonusEventLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author zhao
 * @className BonusEventLogServiceImpl
 * @Description TODO
 * @Date 2020/10/16
 * @Version 1.0
 **/
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BonusEventLogServiceImpl implements BonusEventLogService {
    private final BonusEventLogMapper bonusEventLogMapper;

    @Override
    public List<BonusEventLog> findByUserId(Integer userId) {
        Example example = new Example(BonusEventLog.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", userId);
        return bonusEventLogMapper.selectByExample(example);
    }
}

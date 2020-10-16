package com.soft1851.usercenter.service;

import com.soft1851.usercenter.domain.entity.BonusEventLog;

import java.util.List;

/**
 * @author zhao
 * @className BonusEventLogService
 * @Description TODO
 * @Date 2020/10/16
 * @Version 1.0
 **/
public interface BonusEventLogService {
    /**
     * 根据userId查用户积分详情
     * @param userId
     * @return
     */
    List<BonusEventLog> findByUserId(Integer userId);
}

package com.soft1851.contentcenter.service;

import com.soft1851.contentcenter.domain.entity.MidUserShare;

import java.util.List;

/**
 * @author zhao
 * @className MidUserShareService
 * @Description TODO
 * @Date 2020/10/16
 * @Version 1.0
 **/
public interface MidUserShareService {
    /**
     * 通过用户id查询该用户兑换记录
     * @param userId
     * @return
     */
    List<MidUserShare> getMidUserSharesByUserId(int userId);
}

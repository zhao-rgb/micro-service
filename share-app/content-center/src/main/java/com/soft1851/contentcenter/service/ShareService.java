package com.soft1851.contentcenter.service;

import com.github.pagehelper.PageInfo;
import com.soft1851.contentcenter.domain.dto.ShareDTO;
import com.soft1851.contentcenter.domain.entity.Share;

/**
 * @author zhao
 * @className ShareService
 * @Description TODO
 * @Date 2020/9/29
 * @Version 1.0
 **/

public interface ShareService {
    /**
     * 获得分享详情
     * @return  ShareDTO
     */
    ShareDTO findById(Integer id);

    /**
     * 根据用户查询分享列表
     * @param title
     * @param pageNo
     * @param pageSize
     * @param userId
     * @return
     */
    PageInfo<Share> query(String title, Integer pageNo, Integer pageSize, Integer userId);

    String getHello();
}



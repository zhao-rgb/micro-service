package com.soft1851.contentcenter.service;

import com.soft1851.contentcenter.domain.entity.Notice;

/**
 * @author zhao
 * @className NoticeService
 * @Description TODO
 * @Date 2020/10/4
 * @Version 1.0
 **/
public interface NoticeService {
    /**
     * 查询最新公告
     * @return
     */
    Notice getLatest();
}

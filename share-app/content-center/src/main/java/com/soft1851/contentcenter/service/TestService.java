package com.soft1851.contentcenter.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zhao
 * @className TestService
 * @Description TODO
 * @Date 2020/10/6
 * @Version 1.0
 **/
@Slf4j
@Service
public class TestService {
    //指定sentinel的资源名称
    @SentinelResource("common")

    public String commonMethod(){
        log.info("commonMethod...");
        return "common";
    }
}

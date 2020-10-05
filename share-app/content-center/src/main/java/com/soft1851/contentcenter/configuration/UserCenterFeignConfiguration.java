package com.soft1851.contentcenter.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author zhao
 * @className UserCenterFeignConfiguration
 * @Description TODO
 * @Date 2020/9/30
 * @Version 1.0
 **/
public class UserCenterFeignConfiguration {
    @Bean
    public Logger.Level level(){
        // 让feign打印所有请求的细节
        return Logger.Level.FULL;
    }
}

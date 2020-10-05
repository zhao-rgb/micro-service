package com.soft1851.contentcenter.feignclient;

import com.soft1851.contentcenter.domain.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhao
 * @className TestUserCenterFeignClient
 * @Description TODO
 * @Date 2020/9/30
 * @Version 1.0
 **/
@FeignClient(name = "user-center")
public interface TestUserCenterFeignClient {
    /**
     * 多参数查询
     * @param userDTO
     * @return
     */
    @GetMapping("/users/q")
    UserDTO query(@SpringQueryMap UserDTO userDTO);
}

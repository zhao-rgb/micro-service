package com.soft1851.contentcenter.feignclient;

import com.soft1851.contentcenter.configuration.UserCenterFeignConfiguration;
import com.soft1851.contentcenter.domain.dto.UserAddBonusDTO;
import com.soft1851.contentcenter.domain.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author zhao
 * @className UserCenterFeignClient
 * @Description 用户中心对应的Feign客户端声明接口
 * @Date 2020/9/29
 * @Version 1.0
 **/
@FeignClient(name = "user-center", configuration = UserCenterFeignConfiguration.class)
public interface UserCenterFeignClient {
    /**
     * http://user-center/users/{id}
     *
     * @param id
     * @return UserDTO
     */
    @GetMapping("/users/{id}")
    UserDTO findUserById(@PathVariable Integer id);


    /**
     * 添加积分记录
     *
     * @param userAddBonusDTO
     * @return
     */
    @PostMapping("/users/bonus/new")
    UserDTO addBonus(@RequestBody UserAddBonusDTO userAddBonusDTO);


    /**
     * hello测试
     * @return String
     */
    @GetMapping("/user/hello")
    String getHello();
}
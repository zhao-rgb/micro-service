package com.soft1851.usercenter.controller;

import com.soft1851.usercenter.common.ResponseResult;
import com.soft1851.usercenter.domain.dto.UserAddBonusMsgDTO;
import com.soft1851.usercenter.domain.entity.User;
import com.soft1851.usercenter.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhao
 * @className UserController
 * @Description TODO
 * @Date 2020/9/29
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserController {
    private final UserService userService;

    @GetMapping(value = "/{id}")
    public User findUserById(@PathVariable Integer id) {
        log.info("我被请求啦...");
        return this.userService.findById(id);
    }

    @GetMapping("/q")
    public User query(User user){
        return user;
    }

    @PostMapping("/bonus/new")
    public ResponseResult addBonus(@RequestBody UserAddBonusMsgDTO userAddBonusMsgDTO) {
        System.out.println("添加一条记录");
        return ResponseResult.builder().code(userService.addBonus(userAddBonusMsgDTO)).build();
    }

}

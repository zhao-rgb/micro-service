package com.soft1851.usercenter.controller;

import com.soft1851.usercenter.common.ResponseResult;
import com.soft1851.usercenter.domain.dto.*;
import com.soft1851.usercenter.domain.entity.User;
import com.soft1851.usercenter.service.UserService;
import com.soft1851.usercenter.util.JwtOperator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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
    private final JwtOperator jwtOperator;

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

    @PostMapping(value = "/login")
    public LoginResDTO getUser(@RequestBody LoginDTO loginDto){
        User user = this.userService.login(loginDto);
        //颁发token
        Map<String,Object> userInfo = new HashMap<>(3);
        userInfo.put("id",user.getId());
        userInfo.put("wxNickName",user.getWxNickname());
        userInfo.put("role",user.getRoles());
        String token = jwtOperator.generateToken(userInfo);
        log.info(
                "{}登录成功，生成的token = {},有效期到:{}",
                user.getWxNickname(),
                token,
                jwtOperator.getExpirationTime()
        );
        return LoginResDTO.builder()
                .user(UserRespDto.builder()
                        .id(user.getId())
                        .avatarUrl(user.getAvatarUrl())
                        .wxNickName(user.getWxNickname())
                        .bonus(user.getBonus())
                        .build())
                .token(JwtTokenRespDto
                        .builder()
                        .token(token)
                        .expirationTime(jwtOperator.getExpirationTime().getTime())
                        .build())
                .build();
    }

}

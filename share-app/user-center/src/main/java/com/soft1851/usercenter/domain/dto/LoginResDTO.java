package com.soft1851.usercenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhao
 * @className LoginResDTO
 * @Description 登录返回结果
 * @Date 2020/10/12
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResDTO {
    /**
     * 用户信息
     */
    private UserRespDto user;
    /**
     * token数据
     */
    private JwtTokenRespDto token;
    private Integer isUserSignin;
}

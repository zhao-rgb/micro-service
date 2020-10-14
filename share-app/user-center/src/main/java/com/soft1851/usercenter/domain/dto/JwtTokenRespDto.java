package com.soft1851.usercenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhao
 * @className JwtTokenRespDto
 * @Description 返回结果中的Jwt数据对象
 * @Date 2020/10/13
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class JwtTokenRespDto {
    /**
     * token
     */
    private String token;

    /**
     * 过期时间
     */
    private Long expirationTime;
}

package com.soft1851.usercenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhao
 * @className LoginDTO
 * @Description TODO
 * @Date 2020/10/12
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginDTO {
    private String openId;
    private String wxNickname;
    private String avatarUrl;
}

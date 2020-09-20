package com.soft1851.usercenter.domain.dto;

import lombok.*;

/**
 * @author zhao
 * @className UserDto
 * @Description TODO
 * @Date 2020/9/20
 * @Version 1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer id;
    private String userName;
    private String avatarUrl;
}

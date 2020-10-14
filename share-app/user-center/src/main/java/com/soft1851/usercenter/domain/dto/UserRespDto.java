package com.soft1851.usercenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhao
 * @className UserRespDto
 * @Description 返回结果中的用户数据对象
 * @Date 2020/10/13
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserRespDto {
    private Integer id;
    private String avatarUrl;
    private Integer bonus;
    private String wxNickName;
}

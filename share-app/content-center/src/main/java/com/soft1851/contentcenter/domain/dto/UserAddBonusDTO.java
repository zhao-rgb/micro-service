package com.soft1851.contentcenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhao
 * @className UserAddBonusDTO
 * @Description 用户增加积分的数据传输对象
 * @Date 2020/10/14
 * @Version 1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAddBonusDTO {
    private Integer userId;
    /**
     * 积分
     */
    private Integer bonus;
}

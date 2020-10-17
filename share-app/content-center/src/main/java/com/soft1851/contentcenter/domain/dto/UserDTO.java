package com.soft1851.contentcenter.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author zhao
 * @className UserDTO
 * @Description TODO
 * @Date 2020/9/29
 * @Version 1.0
 **/
@Data
public class UserDTO {
    /**
     * Id
     */
    private Integer id;

    /**
     * 微信id
     */
    private String wxId;

    /**
     * 微信昵称
     */
    private String wxNickname;

    /**
     * 角色
     */
    private String roles;

    /**
     * 头像地址
     */
    private String avatarUrl;

    /**
     * 创建时间
     */
    @JsonFormat(locale = "zh", timezone = "GMT+8" , pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 修改时间
     */
    @JsonFormat(locale = "zh", timezone = "GMT+8" , pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 积分
     */
    private Integer bonus;
}

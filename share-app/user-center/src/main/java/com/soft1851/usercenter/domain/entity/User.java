package com.soft1851.usercenter.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author zhao
 * @className User
 * @Description TODO
 * @Date 2020/9/29
 * @Version 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {
    /**
     * Id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 微信id
     */
    @Column(name = "wx_id")
    private String wxId;

    /**
     * 微信昵称
     */
    @Column(name = "wx_nickname")
    private String wxNickname;

    /**
     * 角色
     */
    private String roles;

    /**
     * 头像地址
     */
    @Column(name = "avatar_url")
    private String avatarUrl;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @JsonFormat(locale = "zh", timezone = "GMT+8" , pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    @JsonFormat(locale = "zh", timezone = "GMT+8" , pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 积分
     */
    private Integer bonus;
}


package com.soft1851.usercenter.domain.entity;

import lombok.*;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author zhao
 * @className User
 * @Description TODO
 * @Date 2020/9/20
 * @Version 1.0
 **/
@Table(name = "t_user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * strategy 设置使用数据库主键自增策略；generator 设置插入完成后，查询最后生成的 ID 填充到该属性中。
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "password")
    private String password;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "create_time")
    private Timestamp createTime;

    @Column(name = "update_time")
    private Timestamp updateTime;

}

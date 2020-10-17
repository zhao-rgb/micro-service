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
 * @className BonusEventLog
 * @Description TODO
 * @Date 2020/10/7
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "bonus_event_log")
public class BonusEventLog {
    /**
     * id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * user.id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 积分操作值
     */
    private Integer value;

    /**
     * 发生的事件
     */
    private String event;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @JsonFormat(locale = "zh", timezone = "GMT+8" , pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 描述
     */
    private String description;

}

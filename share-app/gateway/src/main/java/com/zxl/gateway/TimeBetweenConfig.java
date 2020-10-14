package com.zxl.gateway;

import lombok.Data;

import java.time.LocalTime;

/**
 * @author zhao
 * @className TimeBetweenConfig
 * @Description 定义开始和结束的两个参数
 * @Date 2020/10/9
 * @Version 1.0
 **/

@Data
public class TimeBetweenConfig {
    private LocalTime start;
    private LocalTime end;
}

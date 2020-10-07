package com.soft1851.contentcenter.service;

import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhao
 * @className SentinelTest
 * @Description TODO
 * @Date 2020/10/6
 * @Version 1.0
 **/
public class SentinelTest {
    public static void main(String[] args) throws InternalException, InterruptedException {
        RestTemplate restTemplate = new RestTemplate();
        for (int i = 0;i < 100; i++){
            String object = restTemplate.getForObject("http://localhost:8888/test/byResource", String.class);
            System.out.println(object);
//            Thread.sleep(200);
        }
    }
}


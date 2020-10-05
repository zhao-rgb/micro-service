package com.soft1851.contentcenter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;

/**
 * @author zhao
 * @className HelloHandler
 * @Description TODO
 * @Date 2020/9/23
 * @Version 1.0
 **/
@RestController
@RequestMapping("/consumer")
@ApiIgnore
public class HelloHandler {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String getHello(){
        return restTemplate.getForObject("http://localhost:8001/user/hello",String.class);
    }
}

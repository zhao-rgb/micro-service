package com.soft1851.contentcenter.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.soft1851.contentcenter.domain.dto.UserDTO;
import com.soft1851.contentcenter.feignclient.TestBaiduFeignClient;
import com.soft1851.contentcenter.feignclient.TestUserCenterFeignClient;
import com.soft1851.contentcenter.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Random;

/**
 * @author zhao
 * @className TestController
 * @Description TODO
 * @Date 2020/9/23
 * @Version 1.0
 **/
@Slf4j
@RestController
@RequestMapping(value = "test")
@ApiIgnore
public class TestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/discovery")
    public List<ServiceInstance> getInstances(){
        //查询指定服务的所有实例信息
        return this.discoveryClient.getInstances("user-center");
    }

    @GetMapping(value = "/call/hello")
    public String callUserCenter(){
        List<ServiceInstance> instances = discoveryClient.getInstances("user-center");
        ServiceInstance serviceInstance = instances.get(new Random().nextInt(instances.size()));
        String targetUrl = serviceInstance.getUri() + "/user/hello";
//        String targetUrl = instances.stream()
//                .map(instance -> instance.getUri().toString()+"/user/hello")
//                .findFirst()
//                .orElseThrow(() -> new IllegalArgumentException("当前没有实例"));
        log.info("请求的目标地址：{}",targetUrl);
        return restTemplate.getForObject(targetUrl,String.class);
    }


    @Autowired
    private TestUserCenterFeignClient testUserCenterFeignClient;

    @GetMapping(value = "/test-q")
    public UserDTO query(UserDTO userDTO){
        return testUserCenterFeignClient.query(userDTO);
    }

    @Autowired
    private TestBaiduFeignClient testBaiduFeignClient;
    @GetMapping(value = "/baidu")
    public String baiduIndex(){
        return this.testBaiduFeignClient.index();
    }

    @Autowired
    private TestService testService;

    @GetMapping("test-a")
    public String testA() {
        this.testService.commonMethod();
        return "test-a";
    }

    @GetMapping("test-b")
    public String testB() {
        this.testService.commonMethod();
        return "test-b";
    }

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public String byResource(){
        return "按名称限流";
    }

    public String handleException(BlockException blockException){
        return "服务不可用";
    }
}


package com.soft1851.contentcenter.controller;

import com.soft1851.contentcenter.domain.dto.ShareDTO;
import com.soft1851.contentcenter.domain.entity.Share;
import com.soft1851.contentcenter.service.ShareService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @author zhao
 * @className ShareController
 * @Description TODO
 * @Date 2020/9/29
 * @Version 1.0
 **/
@RestController
@RequestMapping(value =  "/shares")
@Api(tags = "分享接口",value = "提供分享相关的Rest API")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ShareController {
    private final ShareService shareService;

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "通过id查询",notes = "通过id查询")
    public ShareDTO findById(@PathVariable Integer id) {
        return this.shareService.findById(id);
    }

    @GetMapping(value = "/query")
    @ApiOperation(value = "分享列表",notes = "分享列表")
    public List<Share> query(
            @RequestParam(required = false) String title,
            @RequestParam(required = false,defaultValue = "1") Integer pageNo,
            @RequestParam(required = false,defaultValue = "10") Integer pageSize,
            @RequestParam(required = false) Integer userId) throws Exception{
        if(pageSize > 100){
            pageSize = 100;
        }
        return this.shareService.query(title,pageNo,pageSize,userId).getList();
    }


    @GetMapping(value = "/hello")
    @ApiIgnore
    public String getHello(){
        return this.shareService.getHello();
    }

    @GetMapping(value = "/docker")
    @ApiIgnore
    public String docker(){
        return "Hello docker";
    }
}


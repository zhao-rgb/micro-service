package com.soft1851.usercenter.controller;

import com.soft1851.usercenter.domain.entity.BonusEventLog;
import com.soft1851.usercenter.service.BonusEventLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhao
 * @className BonusEventLogController
 * @Description TODO
 * @Date 2020/10/16
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BonusEventLogController {
    private final BonusEventLogService bonusEventLogService;

    @GetMapping(value = "/bonus/{userId}")
    public List<BonusEventLog> findByUserId(@PathVariable Integer userId){
        return this.bonusEventLogService.findByUserId(userId);
    }
}

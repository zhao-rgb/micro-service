package com.soft1851.contentcenter.controller;

import com.soft1851.contentcenter.domain.dto.ShareAuditDTO;
import com.soft1851.contentcenter.domain.entity.Share;
import com.soft1851.contentcenter.service.ShareService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhao
 * @className ShareAdminController
 * @Description 管理员
 * @Date 2020/10/7
 * @Version 1.0
 **/
@RestController
@RequestMapping("/admin/shares")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ShareAdminController {
    private final ShareService shareService;

    @PutMapping(value = "/audit/{id}")
    public Share auditById(@PathVariable Integer id, @RequestBody ShareAuditDTO auditDTO) {
        //此处需要认证授权
        return this.shareService.auditById(id, auditDTO);
    }
}

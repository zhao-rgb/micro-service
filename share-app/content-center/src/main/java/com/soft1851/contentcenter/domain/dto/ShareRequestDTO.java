package com.soft1851.contentcenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhao
 * @className shareRequestDTO
 * @Description TODO
 * @Date 2020/10/7
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ShareRequestDTO {
    private Integer userId;

    private String title;

    private Boolean isOriginal;

    private String author;

    private String cover;

    private String summary;

    private Integer price;

    private String downloadUrl;
}

package com.msld.magicmirror.domain;

import lombok.Data;

@Data
public class UserPoster {
    // 主键，自增
    private Integer id;
    // 用户ID
    private Long userId;
    // 海报图片BASE64字符串
    private String poster;
}

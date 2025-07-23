package com.msld.magicmirror.domain;

import lombok.Data;

@Data
public class ModelType {
    // 主键，自增
    private Integer id;
    // 说明
    private String description;
    // 是否随机(0:否 1:是)
    private Integer isRandom;
}

package com.msld.magicmirror.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Model {
    // 主键，自增
    private Integer id;
    // 类型(1:提问 2:回答)
    private Integer type;
    // 内容
    private String content;
    // 状态(0:禁用 1:启用)
    private Integer status;
    // 是否删除(0:否 1:是)
    private Integer delFlag;
    // 创建时间
    private Date createTime;
}

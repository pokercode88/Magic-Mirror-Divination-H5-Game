package com.msld.magicmirror.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ManaDetail implements Serializable {

    // 主键，自增
    private Integer id;
    // 用户ID
    private Long userId;
    // 描述说明
    private String explain;
    // 变动魔力值
    private Integer amount;
    // 剩余魔力值
    private Integer surplus;
    // 时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
}

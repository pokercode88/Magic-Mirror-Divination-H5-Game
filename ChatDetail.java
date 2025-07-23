package com.msld.magicmirror.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ChatDetail implements Serializable {

    // 主键，自增
    private Long id;
    // 会话ID
    private String chatId;
    // 用户ID
    private Long userId;
    // 六十四卦
    private Integer sixtyFourGua;
    // 角色
    private String role;
    // 内容
    private String content;
    // 模型ID
    private Integer modelId;
    // 模型内容
    private String modelContent;
    // 问答ID
    private String qaId;
    // 是否删除(0:否 1:是)
    private Integer delFlag;
    // 花费魔力值
    private BigDecimal cost;
    // 创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

}

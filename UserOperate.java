package com.msld.magicmirror.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class UserOperate {
    // 主键，自增
    private Integer id;
    // 操作类型(1:登录 2:分享 3:广告 4:占卜 5:相合)
    @NotNull(message = "操作类型不能为空")
    @Min(value = 1, message = "操作类型格式不正确")
    @Max(value = 5, message = "操作类型格式不正确")
    private Integer operateType;
    // 用户ID
    private Long userId;
    // 创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

}

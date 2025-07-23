package com.msld.magicmirror.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SecretHistory {
    // 主键，自增
    private Integer id;
    // 用户ID
    private Long userId;
    // 揭秘类型(1:终生运势 2:两性关系 3:朋友关系 4:亲子关系)
    private Integer type;
    // 紫薇星位置
    private String ziWeiPosition;
    // 命宫位置
    private String mingGongPosition;
    // 资料JSON
    private String dataJson;
    // 创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    //-----
    // 资料
    private List<UserData> dataList;
}

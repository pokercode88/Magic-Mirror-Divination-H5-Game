package com.msld.magicmirror.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class ZhanBu implements Serializable {
    // 主键，自增
    private Integer id;
    // 类型(1:健康 2:爱情 3:事业 4:财富 5:方位)
    private Integer type;
    // 卦象类型(0:乾 1:兑 2:离 3:震 4:巽 5:坎 6:艮 7:坤)
    private Integer guaXiangCode;
    // 卦象
    private String guaXiang;
    // 方位
    private String fangWei;
    // 评分
    private Integer score;
    // 温馨提示
    private String tips;
    // 精灵寄语
    private String elfMessage;
    // 明日行运预告
    private String tomorrowLuckForecast;

}

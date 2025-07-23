package com.msld.magicmirror.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.msld.magicmirror.framework.annotation.MsgSecCheck;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class Chat implements Serializable {

    // 会话ID
    private String chatId;
    // 用户ID
    private Long userId;
    // 会话内容
    @MsgSecCheck(message = "内容违法违规")
    private String content;
    // 六十四卦
    private Integer sixtyFourGua;
    // 是否删除(0:否 1:是)
    private Integer delFlag;
    // 会话时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createAt;

    //-----
    // 聊天明细
    List<ChatDetail> detailList;

    // 六十四卦名称
    private String sixtyFourGuaName;

    // 今日免费聊天次数
    private Integer freeQuestionCount;
}

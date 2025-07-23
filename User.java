package com.msld.magicmirror.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    // 用户ID
    private Long userId;
    // 昵称
    private String nickName;
    // 头像URL
    private String avatarUrl;
    // 性别(0:未知 1:男 2:女)
    private Integer gender;
    // 国家
    private String country;
    // 省份
    private String province;
    // 城市
    private String city;
    // 语言
    private String language;
    // 手机号
    private String mobile;
    // 注册时间
    private Date registerTime;
    // 注册IP
    private String registerIp;
    // 最后登录时间
    private Date lastLoginTime;
    // 最后登录IP
    private String lastLoginIp;
    // 用户唯一标识
    private String openid;
    // 用户在开放平台的唯一标识符
    private String unionid;
    // 魔力值
    private Integer mana;
    // 邀请用户ID
    private Long shareUserId;
    // 完成占卜新手引导标识
    private Integer guideSignDivine;
    // 完成相合新手引导标识
    private Integer guideSignFit;
    // 完成AI问答新手引导标识
    private Integer guideSignAiQA;
    // 状态(0:禁用 1:正常)
    private Integer status;
    // 用户属性(0:测试 1:正式)
    private Integer userAttribute;
}

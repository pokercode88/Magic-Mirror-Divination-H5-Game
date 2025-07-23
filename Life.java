package com.msld.magicmirror.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Life implements Serializable {
    // 主键，自增
    private Integer id;
    // 紫薇星位置
    private String ziWeiPosition;
    // 命宫位置
    private String mingGongPosition;
    // 描述说明
    private String explain;
    // 健康运势
    private String healthLuck;
    // 就医耐性指数
    private Integer medicalIndex;
    // 就医耐性认知分析
    private String medicalAnalysis;
    // 感情态度及婚姻幸福分析
    private String loveMarriageAnalysis;
    // 桃花指数
    private Integer peachIndex;
    // 桃花指数分析
    private String peachAnalysis;
    // 掌控占有欲指数
    private Integer possessionIndex;
    // 掌控占有欲指数分析
    private String possessionAnalysis;
    // 夫妻沟通指数
    private Integer communicationIndex;
    // 夫妻沟通指数分析
    private String communicationAnalysis;
    // 情趣指数
    private Integer interestIndex;
    // 情趣指数分析
    private String interestAnalysis;
    // 事业成就及工作性质分析
    private String careerAnalysis;
    // 责任感指数
    private Integer dutyIndex;
    // 责任感指数分析
    private String dutyAnalysis;
    // 决断力指数
    private Integer decisionIndex;
    // 决断力指数分析
    private String decisionAnalysis;
    // 团队精神指数
    private Integer teamIndex;
    // 团队精神指数分析
    private String teamAnalysis;
    // 投资理财及财富运程分析
    private String richAnalysis;
    // 赚钱能力指数
    private Integer moneyIndex;
    // 赚钱能力指数分析
    private String moneyAnalysis;
    // 理财蓄财指数
    private Integer moneyManageIndex;
    // 理财蓄财指数分析
    private String moneyManageAnalysis;
    // 正偏财指数
    private Integer partialityIndex;
    // 正偏财指数分析
    private String partialityAnalysis;

}

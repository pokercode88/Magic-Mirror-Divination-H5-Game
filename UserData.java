package com.msld.magicmirror.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.msld.magicmirror.framework.annotation.MsgSecCheck;
import com.msld.magicmirror.framework.constant.Type;
import com.msld.magicmirror.framework.util.LunarUtil;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

@Data
public class UserData implements Serializable {
    // 主键，自增
    private Integer id;
    // 用户ID
    private Long userId;
    // 姓名
    @NotBlank(message = "姓名不能为空")
    @Size(max = 10, message = "姓名长度不能超过10个字符")
    // @Pattern(regexp = "[\u4e00-\u9fa5]", message = "姓名必须为中文字符")
    @MsgSecCheck(message = "名称违法违规")
    private String name;

    // 性别(1:男 2:女)
    @NotNull(message = "性别不能为空")
    @Max(value = 2, message = "性别格式不正确")
    @Min(value = 0, message = "性别格式不正确")
    private Integer gender;

    // 生日
    @NotNull(message = "生日不能为空")
    private String birthday;

    // 头像序号
    private Integer avatarIndex;

    // 五行(0:木 1:火 2:土 3:金 4:水)
    private Integer wuXing;

    // 是否闰月(0:否 1:是)
    @Max(value = 1, message = "是否闰月格式不正确")
    @Min(value = 0, message = "是否闰月格式不正确")
    @NotNull(message = "是否闰月不能为空")
    private Integer isRunyue;

    // 是否阳历(0:否 1:是)
    @Max(value = 1, message = "是否阳历格式不正确")
    @Min(value = 0, message = "是否阳历格式不正确")
    @NotNull(message = "是否阳历不能为空")
    private Integer isSolar;

    // 是否默认(0:否 1:是)
    private Integer isDefault;

    //-----
    // 显示出生日期
    private String showDate;

    public String getShowDate() {
        return LunarUtil.getDateText(birthday,
                isSolar, isRunyue);
    }
}

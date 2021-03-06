package com.huboot.share.user_service.enums;

import com.huboot.commons.enums.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DriverFollowIntentionEnum implements BaseEnum {

    following("跟进中"),
    signing("签约"),
    fail("未通过"),
    ;

    private String showName;
}

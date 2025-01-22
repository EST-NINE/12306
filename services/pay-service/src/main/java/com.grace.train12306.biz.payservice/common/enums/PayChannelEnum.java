package com.grace.train12306.biz.payservice.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 支付渠道枚举
 */
@Getter
@RequiredArgsConstructor
public enum PayChannelEnum {

    /**
     * 支付宝
     */
    ALI_PAY(0, "ALI_PAY", "支付宝");

    private final Integer code;

    private final String name;

    private final String value;
}

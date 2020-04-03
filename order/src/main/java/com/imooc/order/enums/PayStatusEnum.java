package com.imooc.order.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 16:12
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功");
    private Integer code;

    private String message;

}

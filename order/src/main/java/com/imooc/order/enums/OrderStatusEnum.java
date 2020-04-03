package com.imooc.order.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 16:11
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消");
    private Integer code;

    private String message;
}

package com.imooc.product.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 21:15
 * @Version 1.0
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum  ResultEnum {
    PRODUCT_NOT_EXIST(1, "商品不存在"),
    PRODUCT_STOCK_ERROR(2, "库存有误");

    private Integer code;

    private String message;
}

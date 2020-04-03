package com.imooc.product.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 14:25
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
public enum ProductStatusEnum {
    UP(0, "上架"),
    DOWN(1, "下架");

    private Integer code;

    private String message;
}

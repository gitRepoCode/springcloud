package com.imooc.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 21:18
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {
    private String prodcutId;

    private Integer productQuantity;
}

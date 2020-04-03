package com.imooc.order.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 16:02
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO {
    private Integer code;

    private String msg;

    private Object data;
}

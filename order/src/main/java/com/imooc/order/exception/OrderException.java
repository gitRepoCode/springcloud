package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 16:14
 * @Version 1.0
 */
public class OrderException extends RuntimeException {
    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}

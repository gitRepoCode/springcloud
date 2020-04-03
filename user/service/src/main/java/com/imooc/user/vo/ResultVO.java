package com.imooc.user.vo;

import lombok.Data;

/**
 * @Author Miracle Luna
 * @Date 2020/4/2 14:06
 * @Version 1.0
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}

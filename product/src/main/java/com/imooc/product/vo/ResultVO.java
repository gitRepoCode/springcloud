package com.imooc.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * http请求返回的最外层对象
 * @Author Miracle Luna
 * @Date 2020/3/31 14:17
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;

    public static void success(Object object){
        new ResultVO<>(1, "操作成功", object);
    }

    public static void fail(){
        new ResultVO<>(1, "操作失败", null);
    }
}

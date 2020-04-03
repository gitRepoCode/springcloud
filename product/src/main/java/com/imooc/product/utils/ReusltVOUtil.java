package com.imooc.product.utils;

import com.imooc.product.vo.ResultVO;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 15:10
 * @Version 1.0
 */
public class ReusltVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}

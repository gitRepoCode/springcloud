package com.imooc.product.service;

import com.imooc.product.dto.CartDTO;
import com.imooc.product.entity.ProductInfo;

import java.util.List;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 14:36
 * @Version 1.0
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 根据商品id获取商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 订单服务减商品库存
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}

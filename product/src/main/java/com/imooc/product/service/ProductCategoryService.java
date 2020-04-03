package com.imooc.product.service;

import com.imooc.product.entity.ProductCategory;

import java.util.List;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 14:39
 * @Version 1.0
 */
public interface ProductCategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}

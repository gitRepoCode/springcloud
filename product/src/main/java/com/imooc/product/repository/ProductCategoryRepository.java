package com.imooc.product.repository;

import com.imooc.product.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 14:32
 * @Version 1.0
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
    /**
     * 根据商品类目标识返回集合
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}

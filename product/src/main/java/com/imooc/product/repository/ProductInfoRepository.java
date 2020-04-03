package com.imooc.product.repository;

import com.imooc.product.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 14:29
 * @Version 1.0
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 更具商品状态返回集合
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);

    /**
     * 根据id返回集合
     * @param productIdList
     * @return
     */
    List<ProductInfo> findByProductIdIn(List<String> productIdList);
}

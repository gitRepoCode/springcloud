package com.imooc.product.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品明细
 * @Author Miracle Luna
 * @Date 2020/3/31 14:27
 * @Version 1.0
 */
@Data
@Entity
public class ProductInfo {
    @Id
    private String productId;

   // 名字
    private String productName;

    // 单价
    private BigDecimal productPrice;

    // 库存
    private Integer productStock;

    // 描述
    private String productDescription;

    // 小图
    private String productIcon;

    // 状态, 0正常1下架
    private Integer productStatus;

    // 类目编号
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}

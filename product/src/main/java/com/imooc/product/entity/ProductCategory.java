package com.imooc.product.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 商品明细
 * @Author Miracle Luna
 * @Date 2020/3/31 14:28
 * @Version 1.0
 */
@Data
@Entity
public class ProductCategory {
    @Id
    @GeneratedValue
    private Integer categoryId;

    // 类目名字
    private String categoryName;

    // 类目编号
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}

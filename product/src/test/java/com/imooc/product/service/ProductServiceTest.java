package com.imooc.product.service;

import com.imooc.product.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 20:43
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {
    @Autowired
    private ProductService productService;

    @Test
    public void findList(){
        List<ProductInfo> list = productService.findList(Arrays.asList("157875196366160022"));
        Assert.assertTrue(list.size() > 0);
    }
}
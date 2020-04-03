package com.imooc.order.controller;

import com.imooc.order.client.ProductClient;
import com.imooc.order.dto.CartDTO;
import com.imooc.order.entity.ProductInfo;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * 服务之间调用的两种方式
 * 1、restTemplate
 * 2、feign
 * @Author Miracle Luna
 * @Date 2020/3/31 17:44
 * @Version 1.0
 */
@RestController
@Slf4j
public class ClientController {
    /*@Autowired
    private LoadBalancerClient loadBalancerClient;// 第二种方式的注入*/

    /*@Autowired
    private RestTemplate restTemplate;// 第三种方式的注入*/

    @Autowired
    private ProductClient productClient;// feign方式调用微服务

    @GetMapping("/getProductMsg")
    public String getProductMsg(){
        // 第一种方式，restTemplate通过url直接获取
        /*RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://localhost:8080/msg", String.class);
        log.info("response -> {}", response);*/

        // 第二种方式，利用LoadBalancerClient获取url，在通过restTemplate请求
        /*RestTemplate restTemplate = new RestTemplate();
        ServiceInstance serviceInstance = loadBalancerClient.choose("product");
        String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort() + "/msg");
        String response = restTemplate.getForObject(url, String.class);*/

        // 第三种方式，通过@LoadBalanced，可在restTemplate里使用应用名称请求
        /*String response = restTemplate.getForObject("http://PRODUCT/msg", String.class);*/

        // feign方式调用微服务
        String response = productClient.productMsg();

        log.info("response -> {}", response);
        return response;
    }


    /**
     * 订单服务 调用 商品服务获取商品列表
     * @return
     */
    @GetMapping("/productList")
    public String productList(){
        List<ProductInfo> productInfos = productClient.listForOrder(Arrays.asList("157875196366160022", "157875227953464068"));
        log.info("response -> {}"+ productInfos);
        return "ok";
    }

    /**
     * 订单服务 调用 商品服务减库存
     * @return
     */
    @GetMapping("/productDecreaseStock")
    public String productDecreaseStock(){
        CartDTO cartDTO = new CartDTO("164103465734242707", 3);
        productClient.decreaseStock(Arrays.asList(cartDTO));
        return "ok";
    }
}

package com.imooc.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.Default;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * @Author Miracle Luna
 * @Date 2020/4/2 21:39
 * @Version 1.0
 */
@Slf4j
@RestController
@DefaultProperties(defaultFallback = "defaultFallback")// 类上的服务降级
public class HystrixController {

    // 方法上的服务降级
    //@HystrixCommand(fallbackMethod = "fallback")

    // 超时设置
    /*@HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "11000")
    })*/

    // 服务熔断
    /*@HystrixCommand(commandProperties = {
			@HystrixProperty(name = "circuitBreaker.enabled", value = "true"),// 设置熔断
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),// 请求数达到后才计算
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),// 休眠时间窗
			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),// 错误率
	})*/
    @HystrixCommand
    @GetMapping("/getProductInfoList")
    public String getProductInfoList(@RequestParam("number") Integer number){
        if (number % 2 == 0) {
            return "success";
        }

        // 调用目标服务出错会降级
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("http://127.0.0.1:8080/product/listForOrder",
                Arrays.asList("157875196366160022"),
                String.class);

        // 自身服务异常也会降级
        //throw new RuntimeException("发送异常");
    }

    private String fallback(){
        return "服务降级，请稍后再试。";
    }

    private String defaultFallback(){
        return "默认提示：服务降级，请稍后再试。";
    }
}

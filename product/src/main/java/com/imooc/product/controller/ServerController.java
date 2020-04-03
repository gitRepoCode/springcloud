package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 17:41
 * @Version 1.0
 */
@RestController
public class ServerController {
    @GetMapping("/msg")
    public String msg(){
        return "product msg";
    }
}

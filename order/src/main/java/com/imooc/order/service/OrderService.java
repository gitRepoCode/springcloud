package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 16:08
 * @Version 1.0
 */
public interface OrderService {
    OrderDTO create(OrderDTO orderDTO);
}

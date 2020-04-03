package com.imooc.order.controller;

import com.imooc.order.dto.OrderDTO;
import com.imooc.order.enums.ResultEnum;
import com.imooc.order.exception.OrderException;
import com.imooc.order.form.OrderForm;
import com.imooc.order.service.OrderService;
import com.imooc.order.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 16:28
 * @Version 1.0
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     * @param orderForm
     * @param bindingResult
     * @return
     */
    @PostMapping("/create")
    public ResultVO create(@Valid OrderForm orderForm, BindingResult bindingResult){
        // 参数验证
        if (bindingResult.hasErrors()) {
            log.error("创建订单参数不正确，orderForm -> {}", orderForm);
            throw new OrderException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }

        // 判断商品id是否是空
        OrderDTO orderDto = OrderDTO.OrderFormConvertOrderDto(orderForm);
        if (CollectionUtils.isEmpty(orderDto.getOrderDetailList())) {
            throw new OrderException(ResultEnum.CART_EMPTY);
        }

        // 保存订单
        OrderDTO result = orderService.create(orderDto);
        Map<String, String> map = new HashMap<>();
        map.put("orderId", result.getOrderId());

        return new ResultVO(0, "成功", map);
    }

}

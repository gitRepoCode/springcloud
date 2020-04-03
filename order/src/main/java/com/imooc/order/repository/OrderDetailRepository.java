package com.imooc.order.repository;

import com.imooc.order.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 16:07
 * @Version 1.0
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}

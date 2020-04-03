package com.imooc.order.repository;

import com.imooc.order.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Miracle Luna
 * @Date 2020/3/31 16:06
 * @Version 1.0
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}

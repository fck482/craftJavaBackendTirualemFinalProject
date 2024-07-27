package com.tiruy.microservice.salesordermanagementserviceapi.Service;

import com.tiruy.microservice.salesordermanagementserviceapi.Dto.OrderResponse;
import com.tiruy.microservice.salesordermanagementserviceapi.Model.Orders;

public interface OrderService {

    public OrderResponse createOrder(Orders order);
    public OrderResponse updateOrder(String orderId, Orders order);
    public Orders getOrder(String orderId);
}

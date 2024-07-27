package com.tiruy.microservice.salesordermanagementserviceapi.Service.Impl;

import com.tiruy.microservice.salesordermanagementserviceapi.Dto.OrderResponse;
import com.tiruy.microservice.salesordermanagementserviceapi.Exception.ResourceNotFoundException;
import com.tiruy.microservice.salesordermanagementserviceapi.Model.Orders;
import com.tiruy.microservice.salesordermanagementserviceapi.Repo.OrderRepo;
import com.tiruy.microservice.salesordermanagementserviceapi.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public OrderResponse createOrder(Orders order) {
        try {


            // Order creation logic
            Orders orders = new Orders();
            orders.setCustomerId(order.getCustomerId());
            orders.setOrderId(order.getOrderId());
            orders.setProducts(order.getProducts());
            orders.setDiscount(order.getDiscount());
            orders.setShippingAddress(order.getShippingAddress());
            orders.setNotes(order.getNotes());

            // Save the order entity
            orderRepo.save(orders);

            // Return success response
            return OrderResponse.builder()
                    .orders(order)
                    .message("Created successfully")
                    .statusCode("1000")
                    .build();
        } catch (Exception e) {
            return OrderResponse.builder()
                    .message("Failed to create customer: " + e.getMessage())
                    .statusCode("555")
                    .build();
        }
    }

    @Override
    public OrderResponse updateOrder(String orderId, Orders order) {
        try {
            // Retrive existing Order
            Orders existingorder = orderRepo.findById(orderId)
                    .orElseThrow(() -> new Exception("Order not found with ID: " + orderId));

            // Updating order details from OrderResponses
            existingorder.setOrderId(order.getOrderId());
            existingorder.setCustomerId(order.getCustomerId());
            existingorder.setProducts(order.getProducts());
            existingorder.setDiscount(order.getDiscount());
            existingorder.setShippingAddress(order.getShippingAddress());
            existingorder.setNotes(order.getNotes());

            // Save updated order
            orderRepo.save(existingorder);

            // Return Success response
            return OrderResponse.builder()
                    .orders(existingorder)
                    .message("Updated successfully")
                    .statusCode("1000")
                    .build();

        } catch (Exception e) {
            // Handle general exceptions
            return OrderResponse.builder()
                    .message("Failed to update order: " + e.getMessage())
                    .statusCode("555")
                    .build();
        }
    }
    @Override
    public Orders getOrder(String orderId) {
        return orderRepo.findById(orderId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + orderId));
    }
}

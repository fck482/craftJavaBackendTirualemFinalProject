package com.tiruy.microservice.salesordermanagementserviceapi.Controller;

import com.tiruy.microservice.salesordermanagementserviceapi.Model.Orders;
import com.tiruy.microservice.salesordermanagementserviceapi.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth/orders/v1")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<?> createOrder(@RequestBody Orders orders) {
        return new ResponseEntity<>(orderService.createOrder(orders), HttpStatus.CREATED);
    }

    @PutMapping("/update/{orderId}")
    public ResponseEntity<?> updateOrder(@PathVariable String orderId, @RequestBody Orders orders) {
        return new ResponseEntity<>(orderService.updateOrder(orderId, orders), HttpStatus.OK);
    }

    @GetMapping("/get/{orderId}")
    public ResponseEntity<?> getOrder(@PathVariable String orderId) {
        return new ResponseEntity<>(orderService.getOrder(orderId), HttpStatus.OK);
    }
}

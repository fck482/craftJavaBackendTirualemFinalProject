package com.tiruy.microservice.customermanagementserviceapi.controllers;


import com.tiruy.microservice.customermanagementserviceapi.Model.Customers;
import com.tiruy.microservice.customermanagementserviceapi.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth/customer/v1")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/create")
    public ResponseEntity<?> createCustomer(@RequestBody Customers customers) {
        return new ResponseEntity<>(customerService.createCustomer(customers), HttpStatus.CREATED);
    }

    @PutMapping("/update/{customerId}")
    public ResponseEntity<?> updateCustomer(@PathVariable String customerId, @RequestBody Customers customers) {
        return new ResponseEntity<>(customerService.updateCustomer(customerId, customers), HttpStatus.OK);
    }

    @GetMapping("/get/{customerId}")
    public ResponseEntity<?> getCustomer(@PathVariable String customerId) {
        return new ResponseEntity<>(customerService.getCustomer(customerId), HttpStatus.OK);
    }

}

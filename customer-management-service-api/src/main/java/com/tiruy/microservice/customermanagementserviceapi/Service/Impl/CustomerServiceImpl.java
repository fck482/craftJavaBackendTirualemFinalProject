package com.tiruy.microservice.customermanagementserviceapi.Service.Impl;

import com.tiruy.microservice.customermanagementserviceapi.exceptions.ResourceNotFoundException;
import com.tiruy.microservice.customermanagementserviceapi.Repo.CustomerRepo;
import com.tiruy.microservice.customermanagementserviceapi.Dto.CustomerResponse;
import com.tiruy.microservice.customermanagementserviceapi.Model.Customers;
import com.tiruy.microservice.customermanagementserviceapi.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public CustomerResponse createCustomer(Customers customers) {
        try {
            customerRepo.save(customers);

            return CustomerResponse.builder()
                    .customers(customers)
                    .message("Created successfully")
                    .statusCode("1000")
                    .build();
        } catch (Exception e) {
            return CustomerResponse.builder()
                    .message("Failed to create customer: " + e.getMessage())
                    .statusCode("555")
                    .build();
        }
    }

    @Override
    public CustomerResponse updateCustomer(String customerId, Customers customers) {
        Optional<Customers> optional = customerRepo.findById(customerId);

        if (optional.isPresent()) {
            try {
                Customers existingCustomer = optional.get();

                existingCustomer.setFirstName(customers.getFirstName());
                existingCustomer.setLastName(customers.getLastName());
                existingCustomer.setEmail(customers.getEmail());
                existingCustomer.setPhone(customers.getPhone());
                existingCustomer.setAddress(customers.getAddress());
                existingCustomer.setNotes(customers.getNotes());
                existingCustomer.setCustomerId(customerId);
                existingCustomer.setCustomFields(customers.getCustomFields());

                customerRepo.save(existingCustomer);

                return CustomerResponse.builder()
                        .customers(existingCustomer)
                        .message("Updated successfully")
                        .statusCode("1000")
                        .build();
            } catch (Exception e) {
                return CustomerResponse.builder()
                        .message("Failed to update customer: " + e.getMessage())
                        .statusCode("555")
                        .build();
            }
        } else {
            return CustomerResponse.builder()
                    .message("Customer not found")
                    .statusCode("404")
                    .build();
            }
    }

    @Override
    public Customers getCustomer(String customerId) {
        return customerRepo.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + customerId));
    }
}

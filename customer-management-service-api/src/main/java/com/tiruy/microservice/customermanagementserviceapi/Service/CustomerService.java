package com.tiruy.microservice.customermanagementserviceapi.Service;

import com.tiruy.microservice.customermanagementserviceapi.Dto.CustomerResponse;
import com.tiruy.microservice.customermanagementserviceapi.Model.Customers;

public interface CustomerService {

    public CustomerResponse createCustomer(Customers customer);
    public CustomerResponse updateCustomer(String customerId, Customers customers);
    public Customers getCustomer(String customerId);
}

package com.tiruy.microservice.customermanagementserviceapi.Repo;

import com.tiruy.microservice.customermanagementserviceapi.Model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customers, String> {
}

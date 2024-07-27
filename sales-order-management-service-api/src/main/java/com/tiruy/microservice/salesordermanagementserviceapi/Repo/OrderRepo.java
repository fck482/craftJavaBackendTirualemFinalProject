package com.tiruy.microservice.salesordermanagementserviceapi.Repo;

import com.tiruy.microservice.salesordermanagementserviceapi.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Orders, String> {
}

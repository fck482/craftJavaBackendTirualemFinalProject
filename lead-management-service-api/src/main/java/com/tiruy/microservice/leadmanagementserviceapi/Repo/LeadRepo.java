package com.tiruy.microservice.leadmanagementserviceapi.Repo;

import com.tiruy.microservice.leadmanagementserviceapi.Model.LeadsMa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepo extends JpaRepository<LeadsMa, String> {
}

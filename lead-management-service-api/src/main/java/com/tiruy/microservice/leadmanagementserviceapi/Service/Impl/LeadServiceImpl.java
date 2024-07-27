package com.tiruy.microservice.leadmanagementserviceapi.Service.Impl;

import com.tiruy.microservice.leadmanagementserviceapi.Dto.LeadResponse;
import com.tiruy.microservice.leadmanagementserviceapi.Model.LeadsMa;
import com.tiruy.microservice.leadmanagementserviceapi.Repo.LeadRepo;
import com.tiruy.microservice.leadmanagementserviceapi.Service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class LeadServiceImpl implements LeadService {

    @Autowired
    LeadRepo leadRepo;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public LeadResponse createLead(LeadsMa leadma) {
        try {
            leadRepo.save(leadma);

            return LeadResponse.builder()
                    .leadma(leadma)
                    .message("Created Successfully")
                    .statusCode("1000")
                    .build();
        } catch (Exception e) {
            return LeadResponse.builder()
                    .message("Failed to create lead: " + e.getMessage())
                    .statusCode("555")
                    .build();
        }
    }

}

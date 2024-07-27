package com.tiruy.microservice.leadmanagementserviceapi.Service;

import com.tiruy.microservice.leadmanagementserviceapi.Dto.LeadResponse;
import com.tiruy.microservice.leadmanagementserviceapi.Model.LeadsMa;

public interface LeadService {

    public LeadResponse createLead (LeadsMa leadma);
//    public CustomerResponse convertLeadToCustomers (String LeadId);
}

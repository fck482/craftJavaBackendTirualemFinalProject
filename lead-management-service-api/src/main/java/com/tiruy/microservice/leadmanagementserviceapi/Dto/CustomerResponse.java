package com.tiruy.microservice.leadmanagementserviceapi.Dto;

import com.tiruy.microservice.leadmanagementserviceapi.Model.LeadsMa;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CustomerResponse {

    private Customers customers;
    private List<LeadsMa> leadma;
    private String message;
    private String statusCode;
}

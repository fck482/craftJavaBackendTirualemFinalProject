package com.tiruy.microservice.leadmanagementserviceapi.Dto;

import com.tiruy.microservice.leadmanagementserviceapi.Model.LeadsMa;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class LeadResponse {

    private LeadsMa leadma;
    private Customers customers;
    private String message;
    private String statusCode;
}
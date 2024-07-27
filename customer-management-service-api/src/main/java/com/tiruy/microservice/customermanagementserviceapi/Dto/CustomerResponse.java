package com.tiruy.microservice.customermanagementserviceapi.Dto;

import com.tiruy.microservice.customermanagementserviceapi.Model.Customers;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CustomerResponse {

    private Customers customers;
    private String message;
    private String statusCode;
}

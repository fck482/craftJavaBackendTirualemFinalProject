package com.tiruy.microservice.leadmanagementserviceapi.Dto;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Customers {

    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private AddInfo address;
    private String notes;
    private Map<String, String> customFields;
}

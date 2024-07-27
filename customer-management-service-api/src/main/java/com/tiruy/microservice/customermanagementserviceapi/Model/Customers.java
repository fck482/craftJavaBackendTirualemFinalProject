package com.tiruy.microservice.customermanagementserviceapi.Model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Map;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Customers {

    @Id
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    @Embedded
    private AddInfo address;
    private String notes;

    @ElementCollection
    private Map<String, String> customFields;
}

package com.tiruy.microservice.leadmanagementserviceapi.Model;

import jakarta.persistence.ElementCollection;
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
public class LeadsMa {

    @Id
    private String leadId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String company;
    private String source;
    private String status = "Open";
    private String notes;

    @ElementCollection
    private Map<String, String> customFields;
}

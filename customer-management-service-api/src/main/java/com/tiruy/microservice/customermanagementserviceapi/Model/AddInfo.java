package com.tiruy.microservice.customermanagementserviceapi.Model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Embeddable
public class AddInfo {
    private String street;
    private String city;
    private String state;
    private String zipcode;

}

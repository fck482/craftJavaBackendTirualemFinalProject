package com.tiruy.microservice.salesordermanagementserviceapi.Model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Orders {

    @Id
    private String orderId;
    private String customerId;

    @ElementCollection
    private List<Products> products;
    private double discount;

    @Embedded
    private AddInfo shippingAddress;
    private String notes;
}

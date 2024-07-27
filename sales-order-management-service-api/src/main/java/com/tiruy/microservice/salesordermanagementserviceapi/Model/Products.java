package com.tiruy.microservice.salesordermanagementserviceapi.Model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Embeddable
public class Products {

    private String productId;
    private int quantity;
    private double price;
}

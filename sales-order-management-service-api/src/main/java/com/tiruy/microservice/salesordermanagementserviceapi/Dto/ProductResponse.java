package com.tiruy.microservice.salesordermanagementserviceapi.Dto;

import com.tiruy.microservice.salesordermanagementserviceapi.Model.Products;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProductResponse {

    private Products products;
    private String message;
    private String statusCode;
}

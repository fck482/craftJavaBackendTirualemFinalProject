package com.tiruy.microservice.salesordermanagementserviceapi.Dto;

import com.tiruy.microservice.salesordermanagementserviceapi.Model.Orders;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class OrderResponse {

    private Orders orders;
    private String message;
    private String statusCode;
}

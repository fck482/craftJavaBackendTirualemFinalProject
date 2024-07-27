package com.tiruy.microservice.leadmanagementserviceapi.Config;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTempConf {

    @Bean
    @CircuitBreaker(name = "default")
    public RestTemplate restTemplate() {

        return new RestTemplate();
    }
}

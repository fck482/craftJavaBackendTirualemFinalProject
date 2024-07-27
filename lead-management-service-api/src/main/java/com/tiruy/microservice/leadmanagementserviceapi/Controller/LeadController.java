package com.tiruy.microservice.leadmanagementserviceapi.Controller;


import com.tiruy.microservice.leadmanagementserviceapi.Model.LeadsMa;
import com.tiruy.microservice.leadmanagementserviceapi.Service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/leads/v1")
public class LeadController {

    @Autowired
    LeadService leadService;

    @PostMapping("/create")
    public ResponseEntity<?> createLead(@RequestBody LeadsMa lead) {
        return new ResponseEntity<>(leadService.createLead(lead), HttpStatus.CREATED);
    }
}

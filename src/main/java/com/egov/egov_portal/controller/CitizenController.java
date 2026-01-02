package com.egov.egov_portal.controller;


import com.egov.egov_portal.model.Citizen;
import com.egov.egov_portal.repository.CitizenRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/citizens")
public class CitizenController {

    private final CitizenRepository citizenRepository;

    public CitizenController(CitizenRepository citizenRepository){
        this.citizenRepository = citizenRepository;
    }

    @PostMapping
    public Citizen register(@RequestBody Citizen citizen){
        return citizenRepository.save(citizen);
    }
}

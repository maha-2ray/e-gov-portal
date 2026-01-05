package com.egov.egov_portal.controller;


import com.egov.egov_portal.model.Citizen;
import com.egov.egov_portal.repository.CitizenRepository;
import com.egov.egov_portal.service.CitizenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/citizens")
public class CitizenController {
    private CitizenService citizenService;

    public CitizenController(CitizenService citizenService ){
        this.citizenService = citizenService;
    }

    public CitizenController() {
    }

    @PostMapping
    public Citizen register(@RequestBody Citizen citizen){
        return citizenService.addCitizen(citizen);
    }

    @GetMapping()
    public List<Citizen> getAllCitizens(){
        return citizenService.getAllCitizens();
    }
//    public CitizenController(){}
}

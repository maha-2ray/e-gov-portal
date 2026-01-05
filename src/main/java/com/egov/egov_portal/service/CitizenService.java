package com.egov.egov_portal.service;

import com.egov.egov_portal.model.Citizen;
import com.egov.egov_portal.repository.CitizenRepository;

import java.util.List;

public class CitizenService {
    private CitizenRepository citizenRepository;

    public CitizenService() {
    }

    public CitizenService(CitizenRepository citizenRepository){
        this.citizenRepository = citizenRepository;
    }

    public List<Citizen> getAllCitizens(){
        return citizenRepository.findAll();
    }

    public Citizen addCitizen(Citizen citizen) {
        citizenRepository.save(citizen);
        return citizen;
    }
}

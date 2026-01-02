package com.egov.egov_portal.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Citizen extends User{

    private int age;
    private String nationality;

}

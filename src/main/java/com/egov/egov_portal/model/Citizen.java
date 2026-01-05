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

    public Citizen(String nationality, int age) {
        this.nationality = nationality;
        this.age = age;
    }
}

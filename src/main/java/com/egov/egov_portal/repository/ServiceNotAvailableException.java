package com.egov.egov_portal.repository;

public class ServiceNotAvailableException extends RuntimeException{

    public ServiceNotAvailableException(String message){
        super(message);
    }
}

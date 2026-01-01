package com.egov.egov_portal;

import org.springframework.boot.SpringApplication;

public class TestEgovPortalApplication {

	public static void main(String[] args) {
		SpringApplication.from(EgovPortalApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

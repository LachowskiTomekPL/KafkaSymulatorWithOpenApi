package com.convista.soe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.convista.shared.model"})
public class SoeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoeApplication.class, args);
	}

}

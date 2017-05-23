package org.mimba.bao;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class CliniqueMedicalePharmacieServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CliniqueMedicalePharmacieServiceApplication.class, args);
	}
}

package org.mimba.bao;

import org.mimba.bao.dao.IProduitRepository;
import org.mimba.bao.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.EndpointMBeanExportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication(exclude = EndpointMBeanExportAutoConfiguration.class)
public class CliniqueMedicalePharmacieServiceApplication implements CommandLineRunner{
	@Autowired
private IProduitRepository iProduitRepository;
	public static void main(String[] args) {
		SpringApplication.run(CliniqueMedicalePharmacieServiceApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		//iProduitRepository.save(new Produit("bannana", "bananier", 30, 19, true, "photo de mon banabz"));
		
	}
}

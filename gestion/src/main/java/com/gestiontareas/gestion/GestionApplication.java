package com.gestiontareas.gestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.gestiontareas.gestion.repository")
@EntityScan(basePackages = "com.gestiontareas.gestion.model")
public class GestionApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(GestionApplication.class, args);
	}

}

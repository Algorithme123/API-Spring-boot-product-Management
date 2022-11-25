package com.shop.produit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
//@SpringBootApplication(exclude = SecurityAutoConfigurationutoConfiguration.class)
public class ProduitApplication {


	public static void main(String[] args) {
		SpringApplication.run(ProduitApplication.class, args);
	}

}

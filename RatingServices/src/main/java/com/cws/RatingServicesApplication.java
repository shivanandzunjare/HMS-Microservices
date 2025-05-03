package com.cws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.cws.entities.Rating;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@SpringBootApplication
@EnableDiscoveryClient
public class RatingServicesApplication {


	public static void main(String[] args) {
		SpringApplication.run(RatingServicesApplication.class, args);
		
//		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
//	        EntityManager em = emf.createEntityManager();
//	        
//	        em.getTransaction().begin();
//
//	        Rating rating = new Rating();
//	        // Manually setting the id if necessary
//	        // rating.setId(1L);
//	        
//
//	        em.persist(rating);
//
//	        em.getTransaction().commit();
//	        em.close();
//	        emf.close();

	}

}

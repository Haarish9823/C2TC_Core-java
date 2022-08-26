package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setName("Haarish");
		
		Address HomeAddress = new Address();
		HomeAddress.setStreet("MG Road");
		HomeAddress.setCity("Bengaluru");
		HomeAddress.setState("Karnataka");
		HomeAddress.setZipcode("560086");
		
		student.setAddress(HomeAddress);
		
		em.persist(student);
		
		em.getTransaction().commit();
		
		em.close();
		

	}

}

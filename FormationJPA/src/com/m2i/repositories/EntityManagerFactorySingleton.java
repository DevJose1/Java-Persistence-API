package com.m2i.repositories;

import javax.persistence.*;

public class EntityManagerFactorySingleton {

	private static EntityManagerFactory emf = null;
	
	private EntityManagerFactorySingleton() {}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("FormationJPA");
		}
		return emf;
	}
	
}

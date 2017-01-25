package com.m2i.tests;

import static org.junit.Assert.*;

import javax.persistence.*;

import org.junit.Test;

import com.m2i.entities.jpa.Media;

public class UnitTest {

	@Test
	public void firstJPATest() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FormationJPA");
		EntityManager em = emf.createEntityManager();
		Media m = em.find(Media.class, 1);
		assertNotNull(m);
		assertEquals(1, (int)m.getId());
		
	}

}

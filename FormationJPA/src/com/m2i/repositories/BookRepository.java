package com.m2i.repositories;

import java.util.List;

import com.m2i.entities.jpa.Media;

//@Repository("BookRepository")
public class BookRepository extends AbstractRepository<Media> {

	@SuppressWarnings("unchecked")
	public List<Media> getByPrice(double price) {
        return getEntityManager().createQuery("select m from Media m where m.price<"+price).getResultList();
    }
	

}

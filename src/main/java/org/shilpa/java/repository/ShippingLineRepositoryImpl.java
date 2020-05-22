package org.shilpa.java.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.shilpa.java.model.ShippingLine;
import org.springframework.stereotype.Repository;

/**
 * @author shilpa
 * @implNote This custom Repositpry Impl class to implement logic for 
 * finding ShippingLine by LineCode.
 */
@Repository
public class ShippingLineRepositoryImpl implements ShippingLineRepository {

	@PersistenceContext
	EntityManager em;
	
	public List<ShippingLine> findShippingLineByLineCode(int lineCode) {
		TypedQuery<ShippingLine> query = em.createQuery("select s from ShippingLine s where s.lineCode = ?1", ShippingLine.class);
		query.setParameter(1, lineCode);
		return query.getResultList();
	}

}

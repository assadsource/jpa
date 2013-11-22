package com.assad.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class JpaDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void testSaveOrder() {
		Order order = new Order();
		order.getItems().add(new Item());
		entityManager.persist(order);
		entityManager.flush();
	}
	@Transactional
	public void testRemOrder(Long id) {
		Order other = (Order) entityManager.find(Order.class, id);
		entityManager.remove(other);
	}	

}

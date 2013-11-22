package com.assad.jpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration("OrderPersistenceTests-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class JpaGamesTests {


	
	@Autowired
	private JpaDao jpaDao;

	@Test
	
	public void testSaveOrderWithItems() throws Exception {
//		jpaDao.testSaveOrder();
		jpaDao.testRemOrder(new Long(5));
	}



}

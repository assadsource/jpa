package com.assad.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.assad.jpa.Contact;


@Service("jpaContactSerivce")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService {
	@PersistenceContext
	private EntityManager em;

	public List<Contact> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contact> findAllWithDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact save(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	public List<Contact> findAllByNativeQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contact> findByCriteriaQuery(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contact> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contact> findByFirstNameAndLastName(String firstName,
			String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
}

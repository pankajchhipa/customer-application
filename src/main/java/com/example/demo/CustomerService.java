package com.example.demo;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService {

	@Autowired
	public CustomerRepository dao;
	
	public CustomerEntity save(CustomerEntity e) {
		
		return dao.save(e);
		
		
	}

	public  Optional<CustomerEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	public Optional<CustomerEntity> findByName(String name) {
		// TODO Auto-generated method stub
		
		return dao.findByName(name);
	}
	

}

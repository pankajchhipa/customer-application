package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface CustomerRepository  extends CrudRepository<CustomerEntity, Integer>{

//	public String save(CustomerEntity e) ;
//	public  List<CustomerEntity> findById(Integer id);
//	public Session getSession();
	@Query("select c from CustomerEntity c where name = :name1 ")
	public Optional<CustomerEntity> findByName(@Param("name1") String s);
}

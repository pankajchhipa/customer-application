package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@Autowired
	public CustomerService service;
	
	
	
	@PostMapping("/create")
	public String createCustomer( @RequestBody Customer cust) {
		
		CustomerEntity ent =new CustomerEntity(cust.getId(), cust.getName(), cust.getAddress()
				,cust.getEmail(), cust.getContact());
		service.save(ent);
		
		
		return "Customer created successfully";
	}
	
	
	@GetMapping("/get/{id}")
	public  CustomerEntity getName(@PathVariable("id") String name) {
		
		
		 Optional<CustomerEntity> ob =  service.findByName(name);
//		System.out.println(ob);
		if(ob.isPresent()) {
//			System.out.println(ob);
			return ob.get();
			
		}
		else {
			System.out.println("no value");
		}
//		env
		return new CustomerEntity();  
	}
	
	@GetMapping("/getdata/{id}")
	public  String getNameNeha(@PathVariable("id") Integer id) {
		
		
		 Optional<CustomerEntity> ob =  service.findById(id);
//		System.out.println(ob);
		if(ob.isPresent()) {
//			System.out.println(ob);
			return "<h1>" +ob.get().getName() +"</h1>";
			
		}
		else {
			System.out.println("no value");
		}
//		env
		return "No value found";  
	}
	
	
	

}

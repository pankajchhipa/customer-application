package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner{
	
	@Autowired
	Environment env;
	
	@Value("${my.app.message}")
	String data1;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		 
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String data  = env.getProperty("my.app.message");
		System.out.println(data1+".----......");
		
		
		
		
		
	}
	

}

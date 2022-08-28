//package com.example.demo;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class CustomerDao implements CustomerRepository{
//	
//	@PersistenceContext
//	public EntityManager entity;
//	
//	@Autowired
//	public SessionFactory factory;
//	
//	public String save(CustomerEntity e) {
//		// TODO Auto-generated method stub
//		
////		getSession().save(e);
//		
//		entity.persist(e);// 
//		return "created";
//	}
//
//
//	@Override
//	public List<CustomerEntity> findById(Integer id) {
//		// TODO Auto-generated method stub
////		CustomerEntity e = entity.find(CustomerEntity.class, id);
////		
////		System.out.println(e);
//		
////		return getSession().createCriteria(CustomerEntity.class).list();
//		 Query q = entity.createQuery("select c from CustomerEntity c ");
//		 List<CustomerEntity> list =q.getResultList();
//		 return list;
//	}
//
//
////	@Override
////	public Session getSession() {
////		// TODO Auto-generated method stub
////		Session s = factory.getCurrentSession();
////		
////		if(s==null) {
////			s = factory.openSession();
////		}
////		return s;
////	}
//	
//	
//}

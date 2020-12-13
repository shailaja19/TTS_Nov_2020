package com.sonata;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


public class TestCriteriaHighestMarks {
   
	public static void main(String[] args) {
    	SessionFactory factory=new Configuration().configure().buildSessionFactory();
    	Session s1=factory.openSession();
    	s1.beginTransaction();
    	Criteria criteria=s1.createCriteria(StudentDetails.class);
    	criteria.setProjection(Projections.max("stdMarks"));
    	
    	List<StudentDetails> users =(List<StudentDetails>)criteria.list();
    	s1.getTransaction().commit();
    	s1.close();
    	
    
    	
    		System.out.println(users);
    	
	}
	
	
}

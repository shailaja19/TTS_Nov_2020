package com.sonata;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestStudent {
    public static void main(String[] args) {
    	
    	Address a1=new Address();
    	a1.setBlockNo(6);
    	a1.setCity("Agra");
    	a1.setPinCode(12345);
    	
    	SchoolData sd=new SchoolData();
    	
    	sd.setSchoolId(121);
    	sd.setOb(a1);
    	sd.setCountStudent(2000);
    
    	
    	SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s1=factory.openSession();
		s1.beginTransaction();
	
		Query q1=s1.createQuery("from Address");//HQL
		List users=q1.list();
		s1.getTransaction().commit();
		s1.close();
		System.out.println( users);
	}
}

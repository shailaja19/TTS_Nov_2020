package com.Sonata;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestStudent {
public static void main(String[] args) {
	
//	StudentTable s2 = new StudentTable();
//	s2.setStudId(4);
//	s2.setStudName("Suresh");
//	s2.setStudMarks(67);
	
	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	Session s1= factory.openSession();
	s1.beginTransaction();
	Query q1=s1.createQuery("from StudentTable");
	List users= q1.list();
	
//	s1.save(s2);
	s1.getTransaction().commit();
	s1.close();
	System.out.println(users);
}
}

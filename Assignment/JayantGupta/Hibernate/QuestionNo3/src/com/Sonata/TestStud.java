package com.Sonata;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestStud {
	public static void main(String[] args) {
		School_Details s2 = new School_Details();
		s2.setPublic(true);
		s2.setSchoolAddress("Greater Noida");
		s2.setStudentCount(1000);
		
		StudAddress a1 = new StudAddress();
		a1.setState("Delhi");
		a1.setCity("Delhi Delhi");
		a1.setStreet("Mayur Vihar Phase II");
		a1.setSchDetails(s2);
		
//		SessionFactory factory= new Configuration().configure().buildSessionFactory();
//		Session s1= factory.openSession();
//		s1.beginTransaction();
//		s1.save(a1);
//		s1.getTransaction().commit();
//		s1.close();
		
		SessionFactory factory1= new Configuration().configure().buildSessionFactory();
		Session s3= factory1.openSession();
		s3.beginTransaction();
		Query q1=s3.createQuery("from StudAddress");
		List users= q1.list();
		s3.getTransaction().commit();
		s3.close();
		System.out.println(users);
		
}
}

package com.sonata;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestStud {
	public static void main(String[] args) {
		
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

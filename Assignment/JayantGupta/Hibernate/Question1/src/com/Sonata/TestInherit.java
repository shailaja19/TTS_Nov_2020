package com.Sonata;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestInherit {
	
	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.setCustomerName("Jayant");
		
		SavingBank s2= new SavingBank();
		s2.setCustomerName("Jayant");
		s2.setSbalance(10000);
		
		CurrentBank c1 = new CurrentBank();
		c1.setCbalance(15000);
		c1.setCustomerName("Jayant");
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1= factory.openSession();
		s1.beginTransaction();
		s1.save(b1);
		s1.save(s2);
		s1.save(c1);
		s1.getTransaction().commit();
		s1.close();	
	}
}

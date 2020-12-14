package com.sonata;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestInherit {
	
	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.setCustomerName("Rimpi");
		
		SavingAccount s2= new SavingAccount();
		s2.setCustomerName("Rimpi");
		s2.setSbalance(90000);
		
		CurrentAccount c1 = new CurrentAccount();
		c1.setCbalance(75000);
		c1.setCustomerName("Rimpi");
		
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

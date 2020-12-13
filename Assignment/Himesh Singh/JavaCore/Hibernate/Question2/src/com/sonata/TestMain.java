package com.sonata;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class TestMain {
    
	public static void main(String[] args) {
		Bank b1= new Bank();
		b1.setCustomerName("virat");
		
		CurrentAccount ca=new CurrentAccount();
	
		ca.setCurrBalance(10000);
		ca.setCustomerName("Gayle");
		SavingAccount sa=new SavingAccount();
		sa.setCustomerName("rohit");
		sa.setSaveBalance(30000);
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1= factory.openSession();
		s1.beginTransaction();
		s1.save(b1);
		s1.save(ca);
		s1.save(sa);
		s1.getTransaction().commit();
		s1.close();	
	}

}

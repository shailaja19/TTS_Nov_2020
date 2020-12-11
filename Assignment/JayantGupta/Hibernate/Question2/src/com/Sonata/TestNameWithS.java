package com.Sonata;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

public class TestNameWithS {
	public static void main(String[] args) {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1= factory.openSession();
		s1.beginTransaction();
		
		Criteria criteria =s1.createCriteria(StudentTable.class);
		criteria.add(Restrictions.like("StudName","S%"));
		List<StudentTable> users= (List<StudentTable>)criteria.list();
		s1.getTransaction().commit();
		s1.close();
		System.out.println(users);
	}
}

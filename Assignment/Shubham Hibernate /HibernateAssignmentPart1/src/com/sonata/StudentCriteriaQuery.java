package com.sonata;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaBuilder;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class StudentCriteriaQuery {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		Criteria criteria = s1.createCriteria(StudentDetails.class);
		//criteria.add(Restrictions.eq("stdName","sam")); 
		//criteria.setMaxResults("StdMarks");
		//criteria.add(Restrictions.ilike("stdName", "s%")); //Name starting with s
		//criteria.add(Restrictions.between("stdId", 1, 4));
		
		//Creating the CriteriaQuery of an 'Object' type to represent result of each query

		
		List<StudentDetails> student = (List<StudentDetails>)criteria.list();
		s1.getTransaction().commit();
		s1.close();
		for(StudentDetails s : student) {
		System.out.println(s.getStdId());
		System.out.println(s.getStdName());
		System.out.println(s.getStdMarks());
		}
	}
}
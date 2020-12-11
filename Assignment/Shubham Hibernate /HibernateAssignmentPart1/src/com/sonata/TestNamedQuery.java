package com.sonata;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestNamedQuery {

	   public static void main(String[] args) {
	    	
	    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session s1 = factory.openSession();
			s1.beginTransaction();
			Query query = s1.getNamedQuery("getStudentDetails.byStdId"); 
			//Query query = s1.getNamedQuery("StudentDetails.findAll"); 
			query.setInteger(0,2);
			
			List<StudentDetails> student = (List<StudentDetails>)query.list();
			
			s1.getTransaction().commit();
			s1.close();
			
			for(StudentDetails s : student) {
				System.out.println(s.getStdId());
				System.out.println(s.getStdName());
				System.out.println(s.getStdMarks());
				}

}
}